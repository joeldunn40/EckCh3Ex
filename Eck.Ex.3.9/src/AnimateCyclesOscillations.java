/** Eck Exercise 3.9
 * Display square moving along tracks
 * at different speeds and cyclic vs oscillating
 * Draw frame background
 * 	Border + tracks
 * Speed
 * 	?pixel per frame 
 * 	?fraction of frameWidth per frameNumber
 * Cyclical square
 * 	position based on ( frameNumber*speed mod frameWidth ) 
 * Oscillating square
 * 	position = frameNumer*speed mod frameWidth*2 additional rule > frameWidth
 * @author Joel
 */
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class AnimateCyclesOscillations extends Application {
    public void drawFrame(GraphicsContext g, int frameNumber, double elapsedSeconds, int width, int height) {

        /* NOTE:  To get a different animation, just erase the contents of this 
         * subroutine and substitute your own. 
         */

        g.setFill(Color.WHITE);
        g.fillRect(0, 0, width, height); // First, fill the entire image with a background color!

        g.setFill(Color.BLACK);
        g.fillText( "Frame number " + frameNumber, 40, 50 );
        g.fillText( String.format("Elapsed Time: %1.1f seconds", elapsedSeconds), 40, 80);

        // Background
        int i;
        double trackPos; // track position
        g.strokeRect(0, 0, width, height); // Border
        for (i = 1; i < 7; i++) {
        	trackPos = (height/6.0)*i+0.5;
        	g.strokeLine(0, trackPos, width, trackPos); // Tracks
        }
        
        // Squares
        int x, y, sqw, sqh; // positions for squares
        int N; // Square speed: frames per cycle
        sqw = 50;
        sqh = height/6;
        // #1
        N = 100;
        x = ((frameNumber % N)*(width))/N;
        g.setFill(Color.RED);
        g.fillRect(x, 0*sqh, 50, sqh);
        // #2
        N = 197;
        x = ((frameNumber % N)*(width))/N;
        g.setFill(Color.GREEN);
        g.fillRect(x, 1*sqh, 50, sqh);
        // #3
        N = 57;
        x = ((frameNumber % N)*(width))/N;
        g.setFill(Color.BLUE);
        g.fillRect(x, 2*sqh, 50, sqh);
        // #4
        N = 100;
        int oscFrameNumber;
        oscFrameNumber = frameNumber % (2*N);        
        x = (oscFrameNumber*(width-sqw))/N;
        if (oscFrameNumber > N)
            x = (2*(width-sqw)) - x;
        g.setFill(Color.CYAN);
        g.fillRect(x, 3*sqh, 50, sqh);
//        g.fillText( String.format("xpos: %1d", x), 40, 4*80);
        // #5
        N = 167;
        oscFrameNumber = frameNumber % (2*N);        
        x = (oscFrameNumber*(width-sqw))/N;
        if (oscFrameNumber > N)
            x = (2*(width-sqw)) - x;
        g.setFill(Color.MAGENTA);
        g.fillRect(x, 4*sqh, 50, sqh);
        // #6
        N = 67;
        oscFrameNumber = frameNumber % (2*N);        
        x = (oscFrameNumber*(width-sqw))/N;
        if (oscFrameNumber > N)
            x = (2*(width-sqw)) - x;
        g.setFill(Color.YELLOW);
        g.fillRect(x, 5*sqh, 50, sqh);
        
    }

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public void start(Stage stage) {
        int width = 800;   // The width of the image.  You can modify this value!
        int height = 600;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple Animation"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
        AnimationTimer anim = new AnimationTimer() {
            private int frameNum;
            private long startTime = -1;
            private long previousTime;
            public void handle(long now) {
                if (startTime < 0) {
                    startTime = previousTime = now;
                    drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
                }
                else if (now - previousTime > 0.95e9/60) {
                       // The test in the else-if is to guard against a bug that has shown
                       // up in some versions of JavaFX on some computers.  The bug allows
                       // the handle() method to be called many times more than the 60 times
                       // per second that is specified in the JavaFX documentation.
                    frameNum++;
                    drawFrame(canvas.getGraphicsContext2D(), frameNum, (now-startTime)/1e9, width, height);
                    previousTime = now;
                }
            }
        };
        anim.start();
    } 

    public static void main(String[] args) {
        launch();
    }

}
