package com.assignment.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author zoranpavlovic.blogspot.com
 */
public class LoadImage extends Application {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		primaryStage.setTitle("Load Image");

		StackPane sp = new StackPane();
		
		File initialFile = new File("/Users/achyutneupane/git/pratibhushanD/PratiDai/res/1.png");
	    InputStream targetStream = new FileInputStream(initialFile);
		Image img = new Image(targetStream);
		ImageView imgView = new ImageView(img);
		
		
		File initialFile1 = new File("/Users/achyutneupane/git/pratibhushanD/PratiDai/res/2.png");
	    InputStream targetStream1 = new FileInputStream(initialFile1);
		Image img1 = new Image(targetStream1);
		ImageView imgView1 = new ImageView(img1);
		
		File initialFile2 = new File("/Users/achyutneupane/git/pratibhushanD/PratiDai/res/3.png");
	    InputStream targetStream2 = new FileInputStream(initialFile2);
		Image img2 = new Image(targetStream2);
		ImageView imgView2 = new ImageView(img2);
		
		
		sp.getChildren().add(imgView);
		sp.getChildren().add(imgView1);
		sp.getChildren().add(imgView2);

		// Adding HBox to the scene
		Scene scene = new Scene(sp);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}