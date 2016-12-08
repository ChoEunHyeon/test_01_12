package com.example.cho.test_12_02;

/**
 * Created by cho on 2016-11-17.
 */

public class Magazine {

    private String name;
    private int flag_id;
    private String text;

    public Magazine(String name, int flag_id, String text){
        this.setName(name);
        this.setFlag_id(flag_id);
        this.setText(text);
    }

    public int getFlag_id() {
        return flag_id;
    }

    public void setFlag_id(int flag_id) {
        this.flag_id = flag_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText(){ return text; }

    public void setText(String text) { this.text = text; }
}