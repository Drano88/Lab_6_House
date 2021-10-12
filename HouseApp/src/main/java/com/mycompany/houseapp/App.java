package com.mycompany.houseapp;



import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    
   

    @Override
    public void start(Stage primaryStage) {
       //Creates sky
       Rectangle sky = new Rectangle( 0,0,1500,600);
       sky.setFill(Color.LIGHTBLUE);
       Group group  = new Group();
       group.getChildren().add(sky);
       
       //Creates grass
       Rectangle grass = new Rectangle( 0,600,1500,500);
       grass.setFill(Color.GREEN);
       group.getChildren().add(grass);
 
       //Creates House
       Rectangle house = new Rectangle( 300,300,900,600);
       house.setFill(Color.BROWN);
     
       group.getChildren().add(house);
       
       // Top Bar
       Rectangle topBar = new Rectangle( 300,300,900,50);
       topBar.setFill(Color.GREY);
       group.getChildren().add(topBar);
      
       // Middle Door  
    
       Rectangle door = new Rectangle(645, 500, 200, 400);
       door.setFill(Color.GREY);
       group.getChildren().add(door);
     
       // Creates event that changes door to open ( yellow) 
       EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>(){
           @Override
           public void handle (MouseEvent e){
            door.setFill(Color.YELLOW);
           
           }
       };
       // Specifies which type of Mouse event & which node causes change
         door.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
       
       // Left door 
       Rectangle door2 = new Rectangle(345, 562.5, 200, 337.5);
       door2.setFill(Color.GREY);
       group.getChildren().add(door2);
       // Right Door
       Rectangle door3 = new Rectangle(945, 562.5, 200, 337.5);
       door3.setFill(Color.GREY);
       group.getChildren().add(door3);
       
       //Above door Window
       Rectangle window1 = new Rectangle(645,700-337.5, 200, 100);
       group.getChildren().add(window1);
        
       int size = 10;
       
       Rectangle[] windowsMid = new Rectangle[size];

         for(int i = 0; i < size; i++)
        {
            windowsMid[i] = new Rectangle(630, 540, 30, 30);
            windowsMid[i].setFill(Color.BLACK);
            
            windowsMid[i].setLayoutY(60 + ((i%5)*60)); 
            windowsMid[i].setLayoutX(60 + ((i/5)*70));
            group.getChildren().add(windowsMid[i]);
        }
       
        Rectangle[] windowsD2 = new Rectangle[size];

         for(int i = 0; i < size; i++)
        {
            windowsD2[i] = new Rectangle(330, 540, 30, 30);
            windowsD2[i].setFill(Color.BLACK);
            
            windowsD2[i].setLayoutY(60 + ((i%5)*60)); 
            windowsD2[i].setLayoutX(60 + ((i/5)*70));
            group.getChildren().add(windowsD2[i]);
        }
        Rectangle[] windowsD3 = new Rectangle[size];

         for(int i = 0; i < size; i++)
        {
            windowsD3[i] = new Rectangle(930, 540, 30, 30);
            windowsD3[i].setFill(Color.BLACK);
            
            windowsD3[i].setLayoutY(60 + ((i%5)*60)); 
            windowsD3[i].setLayoutX(60 + ((i/5)*70));
            group.getChildren().add(windowsD3[i]);
            
        }
         
       Polygon triangle = new Polygon();
       triangle.getPoints().addAll(new Double[]{
        200.0,300.0,
        1300.0,300.0,
        750.0,50.0 });
        
       group.getChildren().add(triangle);
       triangle.setFill(Color.GREY);
       
       Line line1 = new Line(300,300, 1200,300);
       group.getChildren().add(line1);
       
// Dimenstion of overall extend or app scren 
       Scene scene = new Scene (group, 1500,1100);
    
       
        
       primaryStage.setTitle("A HOME");
       primaryStage.setScene(scene);
       primaryStage.show();
       
        
    }
   

    public static void main(String[] args) {
        launch();
    }
    
}