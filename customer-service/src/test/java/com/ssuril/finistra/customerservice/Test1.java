package com.ssuril.finistra.customerservice;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test1 {

    public static void main (String [] args){


        Date d = new Date();
        System.out.println(d.getTime());

        Date d1 = new Date(1608433590448L);
        System.out.println(d1);


        String s = "2020-12-01";
        String e = "2020-12-20";
        LocalDate start = LocalDate.parse(s);
        LocalDate end = LocalDate.parse(e);
        List<LocalDate> totalDates = new ArrayList<>();
        while (!start.isAfter(end)) {
            totalDates.add(start);
            start = start.plusDays(1);
        }

        System.out.println(totalDates);
        for(LocalDate d3 : totalDates){
            ZoneId defaultZoneId = ZoneId.systemDefault();
            Date date = Date.from(d3.atStartOfDay(defaultZoneId).toInstant());
            System.out.println(date.getTime());
            Date dd = new Date(date.getTime());
            //{date:,index}
            System.out.println(dd);
        }
    }
}
