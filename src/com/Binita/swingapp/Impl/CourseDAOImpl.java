/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Binita.swingapp.Impl;

import com.Binita.swingapp.DAO.CourseDAO;
import com.Binita.swingapp.entity.Course;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bini
 */
public class CourseDAOImpl implements CourseDAO {

    @Override
    public int insert(Course course) throws ClassNotFoundException, SQLException {
        Course courses=new Course();
        String forName;
       Class.forName("com.mysql.jdbc.Driver");
       
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
               String sql="INSERT INTO course(name,fees,duration_type,status )VALUES(?,?,?,?)";
               PreparedStatement statement=conn.prepareStatement(sql);
               statement.setString(1,courses.getName());
               statement.setInt(2,courses.getFees());
               statement.setString(3,courses.getDurationType());
               statement.setBoolean(4,courses.isStatus());
               
               int result=statement.executeUpdate(sql);

               conn.close();
               return result;

    }
   
}
