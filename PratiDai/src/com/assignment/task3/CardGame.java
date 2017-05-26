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
import javafx.scene.layout.VBox;
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
    	    	
    	File initialFile = new File("../PratiDai/res/"
    			+ first
    			+ ".png");
	    
    	InputStream targetStream = new FileInputStream(initialFile);
        Image image = new Image(targetStream);
        
        File initialFile_1 = new File("../PratiDai/res/"
    			+ second
    			+ ".png");
	    InputStream targetStream_1 = new FileInputStream(initialFile_1);
        Image image_1 = new Image(targetStream_1);
        
        File initialFile_2 = new File("../PratiDai/res/"
    			+ third
    			+ ".png");
	    InputStream targetStream_2 = new FileInputStream(initialFile_2);
        Image image_2 = new Image(targetStream_2);
        
    	File initialFile1 = new File("../PratiDai/res/53.png");
	    InputStream targetStream1 = new FileInputStream(initialFile1);
        Image image1 = new Image(targetStream1);

        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);

        ImageView iv2 = new ImageView();
        iv2.setImage(image_1);

        ImageView iv3 = new ImageView();
        iv3.setImage(image_2);
        
        ImageView iv4 = new ImageView();
        iv4.setImage(image1);
        iv4.setRotate(45);
        
        ImageView iv5 = new ImageView();
        iv5.setImage(image1);
        iv5.setRotate(90);
        
        HBox box = new HBox();
        box.getChildren().add(iv1);
        box.getChildren().add(iv2);
        box.getChildren().add(iv3);
        
        VBox box1 = new VBox();
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
