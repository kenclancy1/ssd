package Version1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXMosaic1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated constructor stub
		BorderPane Leftbox = new BorderPane();

		Label x;

		Leftbox.setTop(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefHeight(20);

		Leftbox.setRight(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.DEEPPINK, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefWidth(20);

		Leftbox.setBottom(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefHeight(20);

		Leftbox.setLeft(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.DIMGREY, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefWidth(20);

		Leftbox.setCenter(x = new Label());
		x.setAlignment(Pos.CENTER);
		x.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, new CornerRadii(0), new Insets(0))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		Leftbox.setPrefWidth(60);

		// ==========================================

		GridPane Centre = new GridPane();

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {

				// _________________________________

				GridPane chess = new GridPane();

				for (int c1 = 0; c1 < 8; c1++) {
					for (int r1 = 1; r1 < 9; r1++) {
						Label b1 = new Label();

						if ((c1 + r1) % 2 == 0) {
							b1.setBackground(
									new Background(new BackgroundFill(Color.WHITE, new CornerRadii(0), new Insets(0))));

							chess.add(b1, c1, r1);
						} else {
							b1.setBackground(
									new Background(new BackgroundFill(Color.BLACK, new CornerRadii(0), new Insets(0))));

							chess.add(b1, c1, r1);
						}

						GridPane.setHgrow(b1, Priority.ALWAYS);
						GridPane.setVgrow(b1, Priority.ALWAYS);
						b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

					}
				}

				BorderPane topCentre = new BorderPane();

				Label y;
				topCentre.setTop(y = new Label());
				y.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(0), new Insets(0))));
				y.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				y.setPrefHeight(50);

				topCentre.setRight(y = new Label());
				y.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(0), new Insets(0))));
				y.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				y.setPrefWidth(30);

				topCentre.setBottom(y = new Label());
				y.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(0), new Insets(0))));
				y.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				y.setPrefHeight(50);

				topCentre.setLeft(y = new Label());
				y.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(0), new Insets(0))));
				y.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				y.setPrefWidth(30);

				GridPane pinkYellowBox = new GridPane();

				for (int c1 = 0; c1 < 2; c1++) {
					for (int r1 = 1; r1 < 3; r1++) {
						Label py = new Label();

						if ((c1 + r1) % 2 == 0) {
							py.setBackground(new Background(
									new BackgroundFill(Color.YELLOW, new CornerRadii(0), new Insets(0))));

							pinkYellowBox.add(py, c1, r1);
						} 
						else {
							py.setBackground(
									new Background(new BackgroundFill(Color.PINK, new CornerRadii(0), new Insets(0))));

							pinkYellowBox.add(py, c1, r1);
						}

						GridPane.setHgrow(py, Priority.ALWAYS);
						GridPane.setVgrow(py, Priority.ALWAYS);
						py.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
					}
				}

				topCentre.setCenter(pinkYellowBox);
				topCentre.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
				pinkYellowBox.setPrefHeight(40);

				Centre.add(topCentre, 0, 0);
				Centre.setHgrow(topCentre, Priority.ALWAYS);
				Centre.setVgrow(topCentre, Priority.ALWAYS);
				topCentre.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				Centre.add(chess, 0, 1);
				Centre.setHgrow(chess, Priority.ALWAYS);
				Centre.setVgrow(chess, Priority.ALWAYS);
				chess.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

			}
		}

		// ==========================================

		GridPane RightBox = new GridPane();

		for (int c2 = 0; c2 < 1; c2++) {
			for (int r2 = 0; r2 < 3; r2++) {

				Label Top = new Label();
				RightBox.add(Top, 0, 0);
				Top.setBackground(new Background(new BackgroundFill(Color.BLUE, new CornerRadii(0), new Insets(0))));

				Label Middle = new Label();
				RightBox.add(Middle, 0, 1);
				Middle.setBackground(new Background(new BackgroundFill(Color.PINK, new CornerRadii(0), new Insets(0))));

				Pane Bottom = new Pane();
				RightBox.add(Bottom, 0, 2);
				Bottom.setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(0), new Insets(0))));

			GridPane threeLittleBoxes = new GridPane();
			
				for (int tlb = 0; tlb < 3; tlb++) {
				 for (int blt = 0; blt < 1; blt++) {
					 
			 
					 	Label lb1 = new Label();
				
						 threeLittleBoxes.add(lb1, 0, 0);
						lb1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(2))));
						

						Label lb2 = new Label();
				
						threeLittleBoxes.add(lb2, 1, 0);
						lb2.setBackground(new Background(new BackgroundFill(Color.GOLD, new CornerRadii(0), new Insets(2))));

						Label lb3 = new Label();
				
						threeLittleBoxes.add(lb3, 2, 0);
						lb3.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(0), new Insets(2))));
				
						//threeLittleBoxes.setMaxHeight(20);
						
						GridPane.setHgrow(lb1, Priority.ALWAYS);
						//GridPane.setVgrow(lb1, Priority.ALWAYS);
						lb1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

						GridPane.setHgrow(lb2, Priority.ALWAYS);
						//GridPane.setVgrow(lb2, Priority.ALWAYS);
						lb2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

						GridPane.setHgrow(lb3, Priority.ALWAYS);
						//GridPane.setVgrow(lb3, Priority.ALWAYS);
						lb3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
						 			
				 	}
					 //threeLittleBoxes.setPadding(new Insets(4));
					
					// threeLittleBoxes.setHgap(4);
					// threeLittleBoxes.setAlignment(Pos.TOP_CENTER);
					 
				}
			
				
				
				RightBox.add(threeLittleBoxes, 0 ,2);
				GridPane.setHgrow(threeLittleBoxes, Priority.ALWAYS);
				GridPane.setVgrow(threeLittleBoxes, Priority.ALWAYS);
				threeLittleBoxes.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);		
		

				GridPane.setHgrow(Top, Priority.ALWAYS);
				GridPane.setVgrow(Top, Priority.ALWAYS);
				Top.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				GridPane.setHgrow(Middle, Priority.ALWAYS);
				GridPane.setVgrow(Middle, Priority.ALWAYS);
				Middle.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

				GridPane.setHgrow(Bottom, Priority.ALWAYS);
				GridPane.setVgrow(Bottom, Priority.ALWAYS);
				Bottom.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

			}
		}

		// ==========================================

		HBox hb = new HBox(Leftbox, Centre, RightBox);
		HBox.setHgrow(Leftbox, Priority.ALWAYS);
		HBox.setHgrow(Centre, Priority.ALWAYS);
		HBox.setHgrow(RightBox, Priority.ALWAYS);

		Scene s = new Scene(hb, 300, 300);
		primaryStage.setTitle("Mosaic");
		primaryStage.setScene(s);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
