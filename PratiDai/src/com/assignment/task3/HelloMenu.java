package com.assignment.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 

/**
 *
 * @author zoranpavlovic.blogspot.com
 */
public class HelloMenu extends Application {
	 
    @Override public void start(Stage stage) throws FileNotFoundException {
        // load the image
    	File initialFile = new File("/Users/achyutneupane/git/pratibhushanD/PratiDai/res/1.png");
	    InputStream targetStream = new FileInputStream(initialFile);
        Image image = new Image(targetStream);

        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);

        // resizes the image to have width of 100 while preserving the ratio and using
        // higher quality filtering method; this ImageView is also cached to
        // improve performance
        ImageView iv2 = new ImageView();
        iv2.setImage(image);
        //iv2.setFitWidth(100);
        //iv2.setPreserveRatio(true);
        //iv2.setSmooth(true);
        //iv2.setCache(true);

        // defines a viewport into the source image (achieving a "zoom" effect) and
        // displays it rotated
        ImageView iv3 = new ImageView();
        iv3.setImage(image);
        
        ImageView iv4 = new ImageView();
        iv4.setImage(image);
        ImageView iv5 = new ImageView();
        iv5.setImage(image);
        
        //Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
        //iv3.setViewport(viewportRect);
        //iv3.setRotate(90);

        
        Group root = new Group();
        //Scene scene = new Scene(root);
        //scene.setFill(Color.BLUE);
        HBox box = new HBox();
        box.getChildren().add(iv1);
        box.getChildren().add(iv2);
        box.getChildren().add(iv3);
        
        
        HBox box1 = new HBox();
        box1.getChildren().add(iv4);
        box1.getChildren().add(iv5);
   
        
        BorderPane border = new BorderPane();
        border.setTop(box);
        border.setLeft(box1);
        
        Scene scene1 = new Scene(border);
        scene1.setFill(Color.BLUE);
        
      
        //root.getChildren().add(box);

        stage.setTitle("Game Cards");
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setScene(scene1); 
        //stage.sizeToScene(); 
        stage.show(); 
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
