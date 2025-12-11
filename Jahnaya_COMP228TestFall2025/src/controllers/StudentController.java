package controllers;
import java.util.List;
import models.Student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class StudentController {

    public static List<Student> getStudentsByCity(String city) {
        List<Student> students = new ArrayList<>();
String aql = "SELECT * FROM students WHERE city =?";
        return students;
    }


}
