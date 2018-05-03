package com.maple.nba.Crawler;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Calendar;

public class scheduleCrawler extends basicCrawler {
    private int year = Calendar.getInstance().get(Calendar.YEAR)-1;

    private String scheduleLink(int year) {
        return "http://data.nba.net/data/10s/prod/v1/"+year+"/schedule.json";
    }

    public scheduleCrawler() {
        super();
        this.setLink(scheduleLink(this.year));
    }

    public scheduleCrawler(int year) {
        super();
        this.setLink(scheduleLink(year));
    }

    public JSONArray getScheduleList() {
        JSONObject response = getResponse();
        JSONObject league = (JSONObject) response.get("league");
        JSONArray standard = (JSONArray) league.get("standard");
        System.out.println(standard.get(0));
        return standard;
    }





}
