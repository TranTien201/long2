package com.example.long2.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tagID")
    private int tagID;
    private String name;
    private int frequency;

    public Tag() {

    }

    public Tag(int tagID, String name, int frequency) {
        this.tagID = tagID;
        this.name = name;
        this.frequency = frequency;
    }

    public int getTagID() {
        return tagID;
    }

    public void setTagID(int tabID) {
        this.tagID = tabID;
    }

    public String getNameTag() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
