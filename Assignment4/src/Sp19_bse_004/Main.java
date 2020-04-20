package Sp19_bse_004;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {


    String name,gender,city;
    int age;
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane border=new BorderPane();
        GridPane grid=new GridPane();
        grid.setHgap(25);
        grid.setVgap(25);

        Label name=new Label("Name: ");
        grid.add(name, 1, 2);
        TextField name_f=new TextField();
        grid.add(name_f, 2, 2);
        name_f.setOnAction(e->
        {
            this.name=name_f.getText();
        });

        Label gender=new Label("Gender: ");
        grid.add(gender, 1, 3);
        HBox box=new HBox();
        RadioButton male=new RadioButton("Male");
        RadioButton female=new RadioButton("Female");
        box.getChildren().addAll(male,female);
        ToggleGroup togle=new ToggleGroup();
        male.setToggleGroup(togle);
        female.setToggleGroup(togle);
        grid.add(box, 2, 3);
        border.setRight(grid);

        Label age=new Label("Age: ");
        grid.add(age, 1, 4);
        TextField age_f=new TextField();
        grid.add(age_f, 2, 4);
        age_f.setOnAction(ev->
        {
            int a=Integer.parseInt(age_f.getText());
            this.age=a;
        });

        Label city=new Label("City: ");
        grid.add(city, 1, 5);
        ObservableList<String> options=FXCollections.observableArrayList("Lahore","Sialkot","Karachi");
        ComboBox combo=new ComboBox(options);
        combo.setPrefWidth(150);
        combo.setVisibleRowCount(9);
        grid.add(combo, 2, 5);
        combo.setOnAction(e->
        {
            this.city=(String) combo.getValue();
        });

        HBox b_box=new HBox();
        b_box.setSpacing(10);
        Button add=new Button("Add");
        add.setPrefWidth(80);
        Button reset=new Button("Reset");
        reset.setPrefWidth(80);
        Button update=new Button("Update");
        update.setPrefWidth(80);
        b_box.getChildren().addAll(reset,add,update);
        grid.add(b_box, 1, 6,5,1);

        add.setOnAction(e->
        {
            ListView list=new ListView();

            Connection con;
            try {
                border.setLeft(list);
                con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","Titan1999");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("Select *from data");
                while(rs.next())
                {
                    list.getItems().add("   "+rs.getString("name")+"    "+rs.getString("gender")+"     "+rs.getInt("age")+"     "+rs.getString("city")+"");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            //
            if(male.isSelected()==true)
            {
                this.gender="Male";
            }
            else
            {
                this.gender="Female";
            }

            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","Titan1999");
                Statement st=con.createStatement();
                int num=st.executeUpdate("insert into data(name,gender,age,city)values('"+this.name+"','"+this.gender+"',"+this.age+",'"+this.city+"')");
            }

            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }



        });


        reset.setOnAction(e->
        {
            try {
                ListView list=new ListView();
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","Titan1999");
                Statement st=con.createStatement();
                st.executeUpdate("Delete from data");
                border.setLeft(list);
                ResultSet rs=st.executeQuery("Select *from data");
                while(rs.next())
                {
                    list.getItems().add("   "+rs.getString("name")+"    "+rs.getString("gender")+"     "+rs.getInt("age")+"     "+rs.getString("city")+"");
                }
            } catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }

        });


        Scene sc=new Scene(border,700,350);

        primaryStage.setScene(sc);
        primaryStage.show();




    }



    public static void main(String[] args) {


        launch(args);
    }
}

