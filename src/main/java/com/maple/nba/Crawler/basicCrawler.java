package com.maple.nba.Crawler;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import sun.net.www.http.HttpClient;

//Live: https://data.nba.com/data/5s/v2015/json/mobile_teams/nba/2017/scores/00_todays_scores.json
public class basicCrawler {
    public HttpURLConnection conn = null;

    public JSONObject Response = new JSONObject();

    public JSONObject getResponse() {
        return Response;
    }

    public void setResponse(JSONObject response) {
        Response = response;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String link = null;
    String Player = "http://stats.nba.com/stats/commonallplayers?IsOnlyCurrentSeason=1&LeagueID=00&Season=2017-18";
    String stat = "http://stats.nba.com/stats/playercareerstats?LeagueID=00&PlayerID=%s&PerMode=%s";
    String Leader = "http://stats.nba.com/stats/leagueLeaders?LeagueID=00&PerMode=PerGame&Scope=S&Season=2017-18&SeasonType=Playoffs&StatCategory=PTS";

    public basicCrawler() {

    }

    public basicCrawler(String link) throws Exception {
        setLink(link);
//        Document doc = Jsoup.connect(Player).ignoreContentType(true).get();
//        String json = doc.body().text();
//        JSONParser parser = new JSONParser();
//        Object obj = parser.parse(json);
//        setResponse((JSONObject) obj);

    }

    public void init() {
        try {
            Document doc = Jsoup.connect(this.link).ignoreContentType(true).get();
            String json = doc.body().text();
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(json);
            setResponse((JSONObject) obj);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
