package com.maple.nba.Crawler;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class playerCrawler extends basicCrawler {
    private String playerLink = "http://stats.nba.com/stats/commonallplayers?IsOnlyCurrentSeason=1&LeagueID=00&Season=2017-18";
    public playerCrawler() throws Exception {
        super();
        this.setLink(playerLink);
        this.init();
    }

    private JSONObject getResultSet() {
        JSONObject response = getResponse();
        System.out.println(response.toString());
        JSONArray resultSets = (JSONArray)response.get("resultSets");
        return (JSONObject) resultSets.get(0);
    }


    public JSONObject getListHeader() {
        return (JSONObject) getResultSet().get("headers");
    }


    public JSONArray getPlayersList() {
        System.out.println(getResultSet().get("rowSet"));
        return (JSONArray) getResultSet().get("rowSet");
    }
}
