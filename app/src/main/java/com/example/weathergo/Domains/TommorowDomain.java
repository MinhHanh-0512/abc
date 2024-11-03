package com.example.weathergo.Domains;

public class TommorowDomain {
    private String day;
    private String picPath;
    private String status;
    private int hightTemp;
    private int lowTemp;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHightTemp() {
        return hightTemp;
    }

    public void setHightTemp(int hightTemp) {
        this.hightTemp = hightTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }

    public TommorowDomain(String day, String picPath, String status, int hightTemp, int lowTemp) {
        this.day = day;
        this.picPath = picPath;
        this.status = status;
        this.hightTemp = hightTemp;
        this.lowTemp = lowTemp;
    }
}
