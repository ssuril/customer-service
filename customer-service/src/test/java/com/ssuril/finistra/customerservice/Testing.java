package com.ssuril.finistra.customerservice;

import org.apache.tomcat.jni.Local;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Testing {

    public static void main (String [] args) throws Exception{

        String s = "0.01";
        String s1 = "0.01";

        Double d = Double.parseDouble(s);
        Double d1 = Double.parseDouble(s1);

        System.out.println(d+d1);


    }
}
