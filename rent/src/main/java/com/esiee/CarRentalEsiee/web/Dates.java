package com.esiee.CarRentalEsiee.web;

public class Dates {

    String debut;
    String fin;

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Dates{" +
                "debut='" + debut + '\'' +
                ", fin='" + fin + '\'' +
                '}';
    }
}