package org.example;
import org.example.models.Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Main {
//    public static final String TABLE_NAME="Students";
//    public static final String COLUMN_ID= "id";
//    public static final String COLUMN_Name="name";
//    public static final String COLUMN_AGE= "age";
//    public static final String COLUMN_GRADE="grade";

    public static void main(String[] args) {
        String url = "jdbc:sqlite:Mydb.db";
        String creatTableSQL = " CREATE TABLE If NOT EXISTS Students (id integer PRIMARY KEY NOT NULL," +
                "name text," +
                "age interger," +
                "grade text)";


        try {

            Connection c = DriverManager.getConnection(url);
            System.out.println("connected");

            Statement statement= c.createStatement();
            statement.execute(creatTableSQL);
            System.out.println("table created");


            c.close();
        } catch (SQLException e) {
            System.out.println("no");
            e.printStackTrace();

        }

    }
}
