package borderpane;

//import java.awt.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class BorderPaneSovellus extends Application {


    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
    }

    @Override
    public void start(Stage ikkuna){
        BorderPane asettelu = new BorderPane();
        asettelu.setTop(new Label("NORTH"));
        asettelu.setBottom(new Label("SOUTH"));
        asettelu.setRight(new Label("EAST"));
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
                
        
    }

}
