package model;

import java.util.StringJoiner;

public class Film {
    private String title;
    private String type;
    private String rokProdukcji;
    private String production;

    public Film(String title, String type, String rokProdukcji, String production) {
        this.title = title;
        this.type = type;
        this.rokProdukcji = rokProdukcji;
        this.production = production;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "model.Film {" + "title='" + title +
                ", type='" + type +
                ", rokProdukcji='" + rokProdukcji +
                ", production='" + production + '}';
    }
}
