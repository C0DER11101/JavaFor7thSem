import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class greetUser extends Application {
    public static void main(String args[]){
	launch(args);
    }
    
    @Override
    public void start(Stage mainStage){
	mainStage.setTitle("User details");    // title of the window/stage

	Label nameLabel=new Label("Name: ");   // label for name

	TextField nameInput=new TextField();   // for entering name
	nameInput.setPromptText("Name");

	Button greetButton=new Button("Greet me");

	greetButton.setOnAction(e -> changeScene(mainStage, nameInput));

	VBox layout=new VBox(10);
	layout.setPadding(new Insets(10, 10, 10, 10));
	layout.getChildren().addAll(nameLabel, nameInput, greetButton);

	Scene scene=new Scene(layout, 300, 250);

	mainStage.setScene(scene);



	mainStage.show();
    }


    public void changeScene(Stage mainStage, TextField nameInput){
	try{
	    Integer num=Integer.parseInt(nameInput.getText());
	    nameInput.setStyle("-fx-border-color: red ; -fx-border-width: 1px ;");
	}
	catch(NumberFormatException e){
	    nameInput.setStyle("-fx-border-color: red ; -fx-border-width: 1px ;");
	    mainStage.setTitle("GREET");
	    StackPane layout=new StackPane();

	    Label greet=new Label("WELCOME "+nameInput.getText());

	    layout.getChildren().addAll(greet);

	    Scene scene=new Scene(layout, 300, 250);

	    mainStage.setScene(scene);
	    mainStage.show();
	}
    }
}