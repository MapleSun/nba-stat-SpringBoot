package com.maple.nba.Crawler;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Calendar;

public class teamCrawler extends basicCrawler {
    private int year = Calendar.getInstance().get(Calendar.YEAR)-1;

    private String teamLink(int year) {
        return "http://data.nba.net/data/10s/prod/v1/"+year+"/teams.json";
    }

    public teamCrawler()  {
        super();
        try {
            this.setLink(teamLink(year));
        } catch (Exception e) {
            System.out.println(e);
        }

        //this.init();
    }
    public teamCrawler(int year) {
        super();
        try {
            this.setLink(teamLink(year));
        } catch (Exception e) {
            System.out.println(e);
        }

        //this.init();
    }


    public JSONArray getTeamList() {
        JSONObject response = getResponse();
        JSONObject league = (JSONObject) response.get("league");
        JSONArray standard = (JSONArray) league.get("standard");
        //System.out.println(standard.get(0));
        return standard;

    }



}
