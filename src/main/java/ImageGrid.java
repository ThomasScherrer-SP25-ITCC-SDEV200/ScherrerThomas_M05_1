import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGrid extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        // Load images from resources folder
        Image img1 = new Image(getClass().getResource("image1.jpg").toExternalForm());
        Image img2 = new Image(getClass().getResource("image2.jpg").toExternalForm());
        Image img3 = new Image(getClass().getResource("image3.jpg").toExternalForm());
        Image img4 = new Image(getClass().getResource("image4.jpg").toExternalForm());

        // Create ImageViews
        ImageView imgView1 = new ImageView(img1);
        ImageView imgView2 = new ImageView(img2);
        ImageView imgView3 = new ImageView(img3);
        ImageView imgView4 = new ImageView(img4);

        // Set image fit size
        imgView1.setFitWidth(200);
        imgView1.setFitHeight(200);
        imgView2.setFitWidth(200);
        imgView2.setFitHeight(200);
        imgView3.setFitWidth(200);
        imgView3.setFitHeight(200);
        imgView4.setFitWidth(200);
        imgView4.setFitHeight(200);

        // Add images to GridPane
        gridPane.add(imgView1, 0, 0);
        gridPane.add(imgView2, 1, 0);
        gridPane.add(imgView3, 0, 1);
        gridPane.add(imgView4, 1, 1);

        // Create Scene
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setTitle("Image Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
