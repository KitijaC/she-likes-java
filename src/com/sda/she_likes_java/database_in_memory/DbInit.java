package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInit {

    private static final String  createTableQuery = """
            CREATE TABLE STUDENTS
            (
                ID INT PRIMARY KEY AUTO_INCREMENT,\s
                NAME VARCHAR(255) NOT NULL,\s
                SURNAME VARCHAR(255) NOT NULL,\s
                AGE INT NOT NULL DEFAULT 0,\s
                SEX VARCHAR(255));\s
            """;

    private static final String insertDataQuery = """
            INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Mariss', 'Alvares', 23, 'MALE');
            INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Anita', 'Helen', 17, 'FEMALE');
            INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Elina', 'Sun', 15, 'FEMALE');
            INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Eva', 'Lewis', 55, 'FEMALE');
            INSERT INTO STUDENTS ( NAME, SURNAME, AGE, SEX) VALUES ('Olaf', 'Wood', 10, 'MALE');                                                                                 
            """;

    public static void prepareData(Connection dbConnection) {
        try {
            Statement statement = dbConnection.createStatement();

            //create table
            statement.execute(createTableQuery);

            //insert data into table
            statement.execute(insertDataQuery);

        } catch (SQLException e) {
            System.out.println("Problem with preparing new data: " + e);
        }
    }
}
