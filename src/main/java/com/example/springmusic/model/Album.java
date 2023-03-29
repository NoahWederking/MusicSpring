package com.example.springmusic.model;

public class Album {

    private String track_1;
    private String track_2;
    private String track_3;
    private String track_4;
    private int id;

    public Album() {
    }

    public Album(String track_1, int id) {
        this.track_1 = track_1;
        this.id = id;
    }

    public Album(String track_1, String track_2, int id) {
        this.track_1 = track_1;
        this.track_2 = track_2;
        this.id = id;
    }

    public Album(String track_1, String track_2, String track_3, int id) {
        this.track_1 = track_1;
        this.track_2 = track_2;
        this.track_3 = track_3;
        this.id = id;
    }

    public Album(String track_1, String track_2, String track_3, String track_4, int id) {
        this.track_1 = track_1;
        this.track_2 = track_2;
        this.track_3 = track_3;
        this.track_4 = track_4;
        this.id = id;
    }



    public String getTrack_1() {
        return track_1;
    }

    public void setTrack_1(String track_1) {
        this.track_1 = track_1;
    }

    public String getTrack_2() {
        return track_2;
    }

    public void setTrack_2(String track_2) {
        this.track_2 = track_2;
    }

    public String getTrack_3() {
        return track_3;
    }

    public void setTrack_3(String track_3) {
        this.track_3 = track_3;
    }

    public String getTrack_4() {
        return track_4;
    }

    public void setTrack_4(String track_4) {
        this.track_4 = track_4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
