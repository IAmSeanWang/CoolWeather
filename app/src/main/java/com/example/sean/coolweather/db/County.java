package com.example.sean.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Sean on 2017/1/24.
 */

public class County extends DataSupport {
    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId(){
        return id;
    }

    public  void setId(int id){
        this.id=id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countryName) {
        this.countyName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}