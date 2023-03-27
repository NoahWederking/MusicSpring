package com.example.springmusic.model;



public class Musician {

    private int id;
    private String name;
    private String best_album;
    private String record_label;


    public Musician(){}

    public Musician(int id, String name, String best_album, String record_label) {
        this.id = id;
        this.name = name;
        this.best_album = best_album;
        this.record_label = record_label;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBest_album() {
        return best_album;
    }

    public String getRecord_label() {
        return record_label;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBest_album(String best_album) {
        this.best_album = best_album;
    }

    public void setRecord_label(String record_label) {
        this.record_label = record_label;
    }
}
