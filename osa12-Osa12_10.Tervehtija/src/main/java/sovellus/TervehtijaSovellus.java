package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application{


    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
        System.out.println("Hellow world!");
        
        
    }

    @Override
    public void start(Stage ikkuna) {
        
        // ensimmainen nakyma
        
        Label tervehtija = new Label("Kirjoita nimesi ja aloita.");
        TextField nimi =new TextField();
        Button aloitusnappi = new Button("Aloita");
        
        GridPane asettelu = new GridPane();
        
        asettelu.add(tervehtija, 0, 0);
        asettelu.add(nimi, 0, 1);
        asettelu.add(aloitusnappi, 0, 2);
        
        asettelu.setPrefSize(460, 230);
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(15);
        asettelu.setHgap(20);
        asettelu.setPadding(new Insets(25, 25, 25, 0));
        
        Scene nakyma = new Scene(asettelu);
        
        // toinen näkyma
        
        Label tervehtija2 = new Label("Tervetuloa");
        
        StackPane asettelu2 = new StackPane();
        asettelu2.setPrefSize(460, 230);
        asettelu2.getChildren().add(tervehtija2);
        asettelu2.setAlignment(Pos.CENTER);
        
        Scene nakyma2 = new Scene(asettelu2);
        
        aloitusnappi.setOnAction((event) -> {
            tervehtija2.setText("Tervetuloa " + nimi.getText() + "!");
           ikkuna.setScene(nakyma2);
        });
        
        
        
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
        
        
    }
}
