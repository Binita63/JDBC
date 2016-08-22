/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.swingapp.entity;

/**
 *
 * @author Bini
 */
public class Course {
    private int id;
    private String name;
    private int fees,duration;
    private String DurationType;
    private boolean status;
    
    public Course(){
    
    }

    public Course(int id, String name, int fees, int duration, String DurationType, boolean status) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        
        this.DurationType = DurationType;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }


    public String getDurationType() {
        return DurationType;
    }

    public void setDurationType(String DurationType) {
        this.DurationType = DurationType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   
}
