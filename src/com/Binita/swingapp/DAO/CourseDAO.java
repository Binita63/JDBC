/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.swingapp.DAO;

import com.Binita.swingapp.entity.Course;
import java.sql.SQLException;

/**
 *
 * @author Bini
 */
public interface CourseDAO {
    int insert(Course course)throws ClassNotFoundException,SQLException;
}
