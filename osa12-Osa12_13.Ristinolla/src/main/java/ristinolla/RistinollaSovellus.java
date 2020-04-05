package ristinolla;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application{
    
    private String vuoro = "X";
    private boolean lopetus = false;

    @Override
    public void start(Stage ikkuna) {
        Label teksti = new Label("Vuoro: " + vuoro);
        GridPane ruudukko = new GridPane();
        
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                ruudukko.add(nappi(), x, y);
            }
        }
        
        ruudukko.getChildren().stream()
                .map(b -> (Button) b)
                .forEach(b -> b.setOnAction((event) -> {
                    
                    if (!lopetus && b.getText().equals(" ")) {
                        b.setText(vuoro());
                        teksti.setText("Vuoro: " + vuoro);    
                    }
                    
                    if (pelinLopetus(ruudukko)) {
                        lopetus = true;
                        teksti.setText("Loppu!");
                    }
                    
                }));
        
        BorderPane komponentit = new BorderPane();
        komponentit.setTop(teksti);
        komponentit.setCenter(ruudukko);
        
        Scene nakyma = new Scene(komponentit);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    public Button nappi() {
        Button nappi = new Button(" ");
        nappi.setFont(Font.font("Monospaced", 40));
        
        return nappi;
    }
    
    public String vuoro() {
        String vuoroNyt = vuoro;
        
        if (vuoroNyt.equals("X")) {
            vuoro = "O";
        } else {
            vuoro = "X";
        }
        
        return vuoroNyt;
    }
    
    public boolean pelinLopetus(GridPane ruudukko) {
       ObservableList<Node> napit = ruudukko.getChildren();
        
       boolean tasapeli = napit.stream()
                .map(b -> (Button) b)
                .map(b -> b.getText())
                .allMatch(b -> b.matches("X|O"));
        
        if (tasapeli) {
            return true;
        }
        
        for (int y = 0; y < 3; y++) {
            String n1 = ((Button) napit.get(y)).getText();
            String n2 = ((Button) napit.get(y + 3)).getText();
            String n3 = ((Button) napit.get(y + 6)).getText();
            
            if (n1.equals(n2) && n2.equals(n3)) {
                if (!n2.equals(" ")) {
                    return true;
                }
            }
        }
        
        for (int x = 0; x < 9; x += 3) {
            String n1 = ((Button) napit.get(x)).getText();
            String n2 = ((Button) napit.get(x + 1)).getText();
            String n3 = ((Button) napit.get(x + 2)).getText();
            
            if (n1.equals(n2) && n2.equals(n3)) {
                if (!n2.equals(" ")) {
                    return true; 
                }
            }
        }
        
        String n0 = ((Button) napit.get(0)).getText();
        String n2 = ((Button) napit.get(3)).getText();
        String n4 = ((Button) napit.get(4)).getText();
        String n6 = ((Button) napit.get(6)).getText();
        String n8 = ((Button) napit.get(8)).getText();
        
        if (n4.equals(" ")) {
            return false;
        }
        
        if (n0.equals(n4) && n4.equals(n8)) {
            return true;
        }
        
        return n2.equals(n4) && n4.equals(n6);
    }
    

    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }
}