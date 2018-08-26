package com.example.b40.coding2;

public class ItemModel {

    String title,sinopsis;
    int image;

    public ItemModel(String title, String snps, int image) {
        this.title = title;
        this.sinopsis = snps;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String des) {
        this.sinopsis = des.replace("\\\n", System.getProperty("line.separator"));
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
