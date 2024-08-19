/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TechSpot.config;

/**
 *
 * @author Claudio Duhart
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Fecha {  
    Calendar calendar = Calendar.getInstance();    
    String fecha;

    public Fecha() {
    }

    public String Fecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        fecha = sdf.format(calendar.getTime());
//        fecha = calendar.getTime().toString();
        return fecha;
    }

    public String FechaBD() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fecha = sdf.format(calendar.getTime());
        return fecha;
    }
   }