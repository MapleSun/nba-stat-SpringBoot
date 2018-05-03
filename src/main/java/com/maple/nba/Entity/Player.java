package com.maple.nba.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

//@Table(name = "player")
@Entity
public class Player {
    @Id
    private long person_id;
    private String display_last_comma_first;
    private String display_first_last;
    private long rosterStatus;
    private String from_year;
    private String to_year;
    private String playerCode;
    private long team_id;
    private String team_city;
    private String team_name;
    private String team_abbreviation;
    private String team_code;
    private String games_played_flag;

    public Player() {

    }

    public Player(long person_id, String display_last_comma_first, String display_first_last, long rosterstatus, String from_year, String to_year, String playercode, long team_id, String team_city, String team_name, String team_abbreviation, String team_code, String games_played_flag) {
        this.person_id = person_id;
        this.display_last_comma_first = display_last_comma_first;
        this.display_first_last = display_first_last;
        this.rosterStatus = rosterstatus;
        this.from_year = from_year;
        this.to_year = to_year;
        this.playerCode = playercode;
        this.team_id = team_id;
        this.team_city = team_city;
        this.team_name = team_name;
        this.team_abbreviation = team_abbreviation;
        this.team_code = team_code;
        this.games_played_flag = games_played_flag;
    }


    public Player(ArrayList player) {
        this.person_id = (long) player.get(0);
        this.display_last_comma_first = (String) player.get(1);
        this.display_first_last = (String) player.get(2);
        this.rosterStatus = (long) player.get(3);
        this.from_year = (String) player.get(4);
        this.to_year = (String) player.get(5);
        this.playerCode = (String) player.get(6);
        this.team_id = (long) player.get(7);
        this.team_city = (String) player.get(8);
        this.team_name = (String) player.get(9);
        this.team_abbreviation = (String) player.get(10);
        this.team_code = (String) player.get(11);
        this.games_played_flag = (String) player.get(12);
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getDisplay_last_comma_first() {
        return display_last_comma_first;
    }

    public void setDisplay_last_comma_first(String display_last_comma_first) {
        this.display_last_comma_first = display_last_comma_first;
    }

    public String getDisplay_first_last() {
        return display_first_last;
    }

    public void setDisplay_first_last(String display_first_last) {
        this.display_first_last = display_first_last;
    }

    public long getRosterstatus() {
        return rosterStatus;
    }

    public void setRosterstatus(long rosterstatus) {
        this.rosterStatus = rosterstatus;
    }

    public String getFrom_year() {
        return from_year;
    }

    public void setFrom_year(String from_year) {
        this.from_year = from_year;
    }

    public String getTo_year() {
        return to_year;
    }

    public void setTo_year(String to_year) {
        this.to_year = to_year;
    }

    public String getPlayercode() {
        return playerCode;
    }

    public void setPlayercode(String playercode) {
        this.playerCode = playercode;
    }

    public long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(long team_id) {
        this.team_id = team_id;
    }

    public String getTeam_city() {
        return team_city;
    }

    public void setTeam_city(String team_city) {
        this.team_city = team_city;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_abbreviation() {
        return team_abbreviation;
    }

    public void setTeam_abbreviation(String team_abbreviation) {
        this.team_abbreviation = team_abbreviation;
    }

    public String getTeam_code() {
        return team_code;
    }

    public void setTeam_code(String team_code) {
        this.team_code = team_code;
    }

    public String getGames_played_flag() {
        return games_played_flag;
    }

    public void setGames_played_flag(String games_played_flag) {
        this.games_played_flag = games_played_flag;
    }
}


/*
 */