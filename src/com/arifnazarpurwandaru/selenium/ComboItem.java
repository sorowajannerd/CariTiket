/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arifnazarpurwandaru.selenium;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class ComboItem {
    private String value;
    private String label;
    private Date dtVal;

    public ComboItem(){
        
    }
    public ComboItem(String label, String value){
        this.label = label;
        this.value = value;
        
    }
    
    public ComboItem(String label, Date dtVal){
        this.label = label;
        this.dtVal = dtVal;
        
    }
    @Override
    public String toString(){
        return this.label;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getDtVal() {
        return dtVal;
    }

    public void setDtVal(Date dtVal) {
        this.dtVal = dtVal;
    }
    
}
