package com.example.taten.chivasa_cardiobook;

import java.sql.Time;
import java.util.Date;

public class Measurement {

    private String mtime;
    private String mdate;
    private int systolic_pressure;
    private int diastolic_pressure;
    private int heartrate;
    private String Ccomment;


    public void Measurement(String _date, String _time, int spressure, int dpressure, int htrate, String comment) {
        this.mtime = _time;
        this.mdate = _date;
        this.systolic_pressure = spressure;
        this.diastolic_pressure = dpressure;
        this.heartrate = htrate;
        this.Ccomment = comment;


    }
    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public int getSystolic_pressure() {
        return systolic_pressure;
    }

    public void setSystolic_pressure(int systolic_pressure) {
        this.systolic_pressure = systolic_pressure;
    }

    public int getDiastolic_pressure() {
        return diastolic_pressure;
    }

    public void setDiastolic_pressure(int diastolic_pressure) {
        this.diastolic_pressure = diastolic_pressure;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public String getCcomment() {
        return Ccomment;
    }

    public void setCcomment(String ccomment) {
        Ccomment = ccomment;
    }


}
