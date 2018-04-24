package com.maple.nba;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.json.simple.JSONArray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Iterator;


@SpringBootApplication
public class NbaApplication {

    public static void main(String[] args) throws Exception {
        //Crawler crawler = new Crawler();
        // get every single player's string array
        // System.out.println(crawler.getListHeader());
        SpringApplication.run(NbaApplication.class, args);
    }
}
