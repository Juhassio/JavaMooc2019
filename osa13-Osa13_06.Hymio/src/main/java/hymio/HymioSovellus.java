package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class HymioSovellus extends Application {


    public static void main(String[] args) {
        launch(HymioSovellus.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage ikkuna) {

        Canvas piirtoalusta = new Canvas(640, 480);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        //ColorPicker varinValitsin = new ColorPicker();

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);
        
        piirturi.setFill(Color.WHITE);
        piirturi.clearRect(0, 0, 640, 480);
 
        piirturi.setFill(Color.BLACK);
        piirturi.fillRect(100, 50, 50, 50);
        piirturi.fillRect(250, 50, 50, 50);
 
        piirturi.fillRect(100, 250, 200, 50);
        piirturi.fillRect(50, 200, 50, 50);
        piirturi.fillRect(300, 200, 50, 50);


        //asettelu.setRight(varinValitsin);

        /*piirtoalusta.setOnMouseDragged((event) -> {
            double kohtaX = event.getX();
            double kohtaY = event.getY();
            piirturi.setFill(Color.WHITE);
            piirturi.setFill(varinValitsin.getValue());
            //piirturi.fillOval(kohtaX, kohtaY, 4, 4);
            piirturi.fillRect(kohtaX, kohtaY, 25, 25);
        });*/

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
