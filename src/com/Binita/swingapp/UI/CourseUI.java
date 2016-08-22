/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.swingapp.UI;

import com.Binita.swingapp.DAO.CourseDAO;
import com.Binita.swingapp.Impl.CourseDAOImpl;
import com.Binita.swingapp.entity.Course;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bini
 */
public class CourseUI extends JFrame {
    private JLabel lblCourseName;
    private JTextField txtCOurseName;
    private JLabel lblFees;
    private JTextField txtFees;
    private JLabel lblDurationtype;
    private JComboBox cmbDurationtype;
    private JLabel lblStatus;
    private JCheckBox chkStatus;
    private JButton btnSave;
    public CourseUI(){
        setTitle("Course");
        setSize(400,400);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }
    private void initComponents(){
    lblCourseName=new JLabel("Course Name");
    txtCOurseName=new JTextField(30);
    lblFees=new JLabel("Course Fee");
    txtFees=new JTextField(30);
    cmbDurationtype=new JComboBox();
    cmbDurationtype.addItem("day");
    cmbDurationtype.addItem("week");
    cmbDurationtype.addItem("month");
    cmbDurationtype.addItem("year");
    lblStatus=new JLabel("Status");
    chkStatus=new JCheckBox();
    btnSave=new JButton("Save");
    
    add(lblCourseName);
    add(txtCOurseName);
    add(lblFees);
    add(txtFees);
    add(cmbDurationtype);
    add(lblStatus);
    add(chkStatus);
    add(btnSave);
    btnSave.addActionListener(new SaveButtonListener());
    }
    private void clearFields(){
    txtCOurseName.setText("");
    txtFees.setText("");
    cmbDurationtype.setSelectedIndex(0);
    chkStatus.setSelected(false);
    }
   private class SaveButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            CourseDAO courseDAO=new CourseDAOImpl();
           Course c=new Course();
           c.setName((txtCOurseName.getText()));
           c.setFees((Integer.parseInt(txtFees.getText())));
           c.setDurationType((String) cmbDurationtype.getSelectedItem());
           c.setStatus(chkStatus.isSelected());
           try{
           courseDAO.insert(c);
           JOptionPane.showMessageDialog(null, "course added sucessfully");
           clearFields();
           }catch(ClassNotFoundException | SQLException se){
               JOptionPane.showMessageDialog(null, se.getMessage());
           }
                   
        }
   
   
   }
}
