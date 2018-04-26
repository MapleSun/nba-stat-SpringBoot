package com.maple.nba;

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
public class Crawler {
    public HttpURLConnection conn = null;

    public JSONObject Response = new JSONObject();

    public JSONObject getResponse() {
        return Response;
    }

    public void setResponse(JSONObject response) {
        Response = response;
    }


    String Player = "http://stats.nba.com/stats/commonallplayers?IsOnlyCurrentSeason=1&LeagueID=00&Season=2017-18";
    String stat = "http://stats.nba.com/stats/playercareerstats?LeagueID=00&PlayerID=%s&PerMode=%s";
    String Leader = "http://stats.nba.com/stats/leagueLeaders?LeagueID=00&PerMode=PerGame&Scope=S&Season=2017-18&SeasonType=Playoffs&StatCategory=PTS";
    public Crawler() throws Exception {
        Document doc = Jsoup.connect(Player).ignoreContentType(true).get();
        String json = doc.body().text();
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(json);
        setResponse((JSONObject) obj);
        //System.out.println(getResponse().get("resultSets"));



        //        HttpURLConnection connection = null;
//        try {
//            String link = Player; //Leader;
//            URL url = new URL(link);
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setReadTimeout(5000);
//            connection.connect();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        InputStream stream = connection.getInputStream();
//        int responseCode = connection.getResponseCode();
//        ByteArrayOutputStream responseBody = new ByteArrayOutputStream();
//        System.out.println(responseCode);



//        JSONParser parser = new JSONParser();
//
//        // JSON file
//        InputStreamReader inputJson = new InputStreamReader(conn.getInputStream());
//        Object obj = parser.parse(inputJson);
//        System.out.println(obj.toString());



        //this.Response = (JSONObject) obj;
        //setResponse((JSONObject) obj);
    }

    // "http://stats.nba.com/stats/leagueLeaders?LeagueID=00&PerMode=PerGame&Scope=S&Season=2017-18&SeasonType=Playoffs&StatCategory=PTS";
    //

    private JSONObject getResultSet() {
        JSONObject response = getResponse();
        System.out.println(response.toString());
        JSONArray resultSets = (JSONArray)response.get("resultSets");
        //System.out.println(resultSets.toString());
        return (JSONObject) resultSets.get(0);
    }


    public JSONObject getListHeader() {
        return (JSONObject) getResultSet().get("headers");
    }


    /*
        Funtion: get every single player's string array


        Example:
        Iterator<JSONArray> players = crawler.getPlayersList().iterator();
        while (players.hasNext()) {
            System.out.println(players.next());

        }

        players.next().toArray();

     */
    public JSONArray getPlayersList() {
        System.out.println(getResultSet().get("rowSet"));
        return (JSONArray) getResultSet().get("rowSet");
    }


}
