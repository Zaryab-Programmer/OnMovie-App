package com.zaryab.omovie.Model;

public class Filmshl {
    private String name;
    private String Image;

    String menuId;

    public Filmshl() {
    }

    public Filmshl(String name, String image) {
        this.name = name;
        Image = image;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
