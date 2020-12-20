package com.ssuril.finistra.customerservice;



import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import sun.lwawt.macosx.CSystemTray;

import javax.naming.spi.DirObjectFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Test {

    public static void main(String [] args){

        String fromCcy = "EUR";
        String toCcy = "USD";

        //function FX_WEEKLY
        // "https://alpha-vantage.p.rapidapi.com/query?from_symbol=EUR&to_symbol=USD&function=FX_WEEKLY&datatype=json"
        //function FX_INTRADAY
        // "https://alpha-vantage.p.rapidapi.com/query?function=FX_INTRADAY&to_symbol=USD&interval=5min&from_symbol=EUR&datatype=json&outputsize=compact"
        //function FX_DAILY
        //"https://alpha-vantage.p.rapidapi.com/query?from_symbol=EUR&function=FX_DAILY&to_symbol=USD&outputsize=compact&datatype=json"
        //function FX_MONTHLY
        //"https://alpha-vantage.p.rapidapi.com/query?to_symbol=USD&function=FX_MONTHLY&from_symbol=EUR&datatype=json"

        String url = "https://alpha-vantage.p.rapidapi.com/query?from_symbol="+fromCcy+"&to_symbol="+toCcy+"&function=FX_WEEKLY&datatype=json";
        //
        RestTemplate restTemplate = new RestTemplate();
        try {
            HttpHeaders headers = createHttpHeaders();
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, entity, Object.class);
            System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
            System.out.println(response.getBody());

            Map map = (LinkedHashMap)response.getBody();
            Map mp1 = (LinkedHashMap)map.get("Time Series FX (Weekly)");
            Set<String> o = mp1.keySet();
            for(String s: o){
             System.out.println("Key Value is " +s);
                Map mp2 = (LinkedHashMap)mp1.get(s);
                double open = Double.parseDouble((String)mp2.get("1. open"));
                System.out.println("Open  :" + open);
                System.out.println("high  :" + mp2.get("2. high"));
                System.out.println("low  :" + mp2.get("3. low"));
                System.out.println("close  :" + mp2.get("4. close"));
            }

        }
        catch (Exception eek) {
            System.out.println("** Exception: "+ eek.getMessage());
        }
    }

    private static HttpHeaders createHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-RapidAPI-Key", "a04448e3aemsh0e08a4c94de6610p182612jsn4d517d4e8d55");
        headers.add("X-RapidAPI-Host", "alpha-vantage.p.rapidapi.com");
        return headers;
    }
}
