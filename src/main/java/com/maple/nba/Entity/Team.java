package com.maple.nba.Entity;

import org.json.simple.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

@Entity
public class Team {
    @Id
    private Long teamId;
    private Boolean isNBAFranchise;
    private Boolean isAllStar;
    private String city;
    private String altCityName;
    private String fullName;
    private String tricode;
    private String nickname;
    private String urlName;
    private String confName;
    private String divName;

    public Team() {

    }

    public Team(HashMap Team) {
        for (Field field : this.getClass().getDeclaredFields()) {
            try {
               // System.out.println(field.getType().toString());
                if (field.getType().equals(Long.class)) {

                    field.set(this, Long.parseLong(Team.get(field.getName()).toString()));
                } else {
                    field.set(this, Team.get(field.getName()));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Boolean getNBAFranchise() {
        return isNBAFranchise;
    }

    public void setNBAFranchise(Boolean NBAFranchise) {
        isNBAFranchise = NBAFranchise;
    }

    public Boolean getAllStar() {
        return isAllStar;
    }

    public void setAllStar(Boolean allStar) {
        isAllStar = allStar;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAltCityName() {
        return altCityName;
    }

    public void setAltCityName(String altCityName) {
        this.altCityName = altCityName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTricode() {
        return tricode;
    }

    public void setTricode(String tricode) {
        this.tricode = tricode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String getDivName() {
        return divName;
    }

    public void setDivName(String divName) {
        this.divName = divName;
    }
}
