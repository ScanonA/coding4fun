package com.example.greenbin;

import android.app.Application;

public class GreenBin extends Application {

    public long score;
    public long points;
    public long credits;

    public long getPoints(){
        return points;
    }

    public void setPoints(long x){
        points = x;
    }

    public long getScore(){
        return score;
    }

    public void setScore(long x){
        score = x;
    }

    public long getCredits(){
        return credits;
    }

    public void setCredits(long x){
        credits = x;
    }

}
