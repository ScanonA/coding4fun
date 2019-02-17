package com.example.greenbin;

import android.app.Application;

public class MyApplication extends Application {

    public long credits;
    public long score;

    public long getCredits(){
        return credits;
    }

    public void setCredits(long x){
        credits = x;
    }

    public long getScore(){
        return score;
    }

    public void setScore(long x){
        score = x;
    }

}
