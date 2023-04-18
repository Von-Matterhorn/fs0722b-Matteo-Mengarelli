package com.app.capstone.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "catalogo")
public class catalogo {

    public catalogo(){}

    @Id
    private Integer id;
    private String title;
    private String img;
    private String players;
    private String genre;
    private String price;
    private String platform;
    private String release;
    private String editor;
    private String voices;
    private String languages;
    private String info;

    public catalogo(Integer id, String title, String img, String players, String genre, String price, String platform, String release, String editor, String voices, String languages, String info) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.players = players;
        this.genre = genre;
        this.price = price;
        this.platform = platform;
        this.release = release;
        this.editor = editor;
        this.voices = voices;
        this.languages = languages;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getVoices() {
        return voices;
    }

    public void setVoices(String voices) {
        this.voices = voices;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
