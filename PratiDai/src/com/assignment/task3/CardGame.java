package com.assignment.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 


public class CardGame extends Application {
	 
    @Override public void start(Stage stage) throws FileNotFoundException {
    
    
    	int first=0; int second=0; int third=0;
    	RandomNumber r = new RandomNumber();
    	first = r.generateRandomnumber(0, 52);
    	
    	do{
    		second= r.generateRandomnumber(0, 52);
    	}while( first == second);
    	
    	do{
    		third= r.generateRandomnumber(0, 52);
    	}while( third ==second || third ==first);
    	
    	
    	File initialFile = new File("/Users/achyutneupane/git/"
    			+ "pratibhushanD/PratiDai/res/"
    			+ first
    			+ ".png");
	    
    	InputStream targetStream = new FileInputStream(initialFile);
        Image image = new Image(targetStream);
        
        
        
        File initialFile_1 = new File("/Users/achyutneupane/git/"
    			+ "pratibhushanD/PratiDai/res/"
    			+ second
    			+ ".png");
	    InputStream targetStream_1 = new FileInputStream(initialFile_1);
        Image image_1 = new Image(targetStream_1);
        
        File initialFile_2 = new File("/Users/achyutneupane/git/"
    			+ "pratibhushanD/PratiDai/res/"
    			+ third
    			+ ".png");
	    InputStream targetStream_2 = new FileInputStream(initialFile_2);
        Image image_2 = new Image(targetStream_2);
        
        
        
        
        
    	File initialFile1 = new File("/Users/achyutneupane/git/pratibhushanD"
    			+ "/PratiDai/res/53.png");
	    InputStream targetStream1 = new FileInputStream(initialFile1);
        Image image1 = new Image(targetStream1);

        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);

        // resizes the image to have width of 100 while preserving the ratio and using
        // higher quality filtering method; this ImageView is also cached to
        // improve performance
        ImageView iv2 = new ImageView();
        iv2.setImage(image_1);
        //iv2.setFitWidth(100);
        //iv2.setPreserveRatio(true);
        //iv2.setSmooth(true);
        //iv2.setCache(true);

        // defines a viewport into the source image (achieving a "zoom" effect) and
        // displays it rotated
        ImageView iv3 = new ImageView();
        iv3.setImage(image_2);
        
        
        
        
        ImageView iv4 = new ImageView();
        iv4.setImage(image1);
        iv4.setRotate(45);
        
        ImageView iv5 = new ImageView();
        iv5.setImage(image1);
        iv5.setRotate(90);
        
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
        
        HBox box2 = new HBox();
        box2.getChildren().add(iv5);
   
        
        BorderPane border = new BorderPane();
        border.setTop(box);
        border.setLeft(box1);
        border.setCenter(box2);
        
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
