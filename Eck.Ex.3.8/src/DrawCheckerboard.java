/** Eck Exercise 3.8
 * Draw checkboard 400 x 400 pixels: 8x8
 * Draw multiple rectangles
 * Double Loop on row & column
 *  increment by 50 pixels on each
 * 	alternate black & red fill
 * @author Joel
 */
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawCheckerboard extends Application {
    /**
     * Draws a picture.  The parameters width and height give the size 
     * of the drawing area, in pixels.  
     */
    public void drawPicture(GraphicsContext g, int width, int height) {

    	double x, y; // top left coord of each square
    	int i, j; // loop counters for squares
    	x = y = 0.0; // initialize x & y positions
    	for (i = 0; i < 8; i++ ) {
    		x = i*50;
    		for (j = 0; j < 8; j++) {
    			y = j*50;
    			// Red or Black (odd or even sum)
    			if ( (i+j)%2 == 0 ) {
    				g.setFill(Color.BLACK);    				
    			} else 
    				g.setFill(Color.RED);
    			g.fillRect(x, y, 50, 50);
    		}
    	}
    	
    } // end drawPicture()

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public void start(Stage stage) {
        int width = 400;   // The width of the image.  You can modify this value!
        int height = 400;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple Graphics"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
    } 

    public static void main(String[] args) {
        launch();
    }

}
