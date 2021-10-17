package com.example.judaicapp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Hollidays {
    GregorianCalendar date = new GregorianCalendar();
    Calendar calendar = new GregorianCalendar();



    ArrayList<GregorianCalendar> rosh_chodesh = new ArrayList<>();
    ArrayList<GregorianCalendar> purim = new ArrayList<>();
    ArrayList<GregorianCalendar> shushan_purim = new ArrayList<>();
    ArrayList<GregorianCalendar> pesach = new ArrayList<>();
    ArrayList<GregorianCalendar> sukkos = new ArrayList<>();
    ArrayList<GregorianCalendar> chanukah = new ArrayList<>();
    ArrayList<GregorianCalendar> tisha_baav = new ArrayList<>();
    ArrayList<GregorianCalendar> tzom_gedalya = new ArrayList<>();
    ArrayList<GregorianCalendar> asara_betevet = new ArrayList<>();
    ArrayList<GregorianCalendar> taanis_ester = new ArrayList<>();
    ArrayList<GregorianCalendar> shivaAsar_betammuz = new ArrayList<>();



    public Hollidays(){


        rosh_chodesh.add(new GregorianCalendar(2021, 10, 6));
        rosh_chodesh.add(new GregorianCalendar(2021, 10, 7));
        rosh_chodesh.add(new GregorianCalendar(2021, 11, 5));
        rosh_chodesh.add(new GregorianCalendar(2021, 12, 4));
        rosh_chodesh.add(new GregorianCalendar(2021, 12, 5));
        rosh_chodesh.add(new GregorianCalendar(2022, 1, 3));
        rosh_chodesh.add(new GregorianCalendar(2022, 2, 1));
        rosh_chodesh.add(new GregorianCalendar(2022, 2, 2));
        rosh_chodesh.add(new GregorianCalendar(2022, 3, 3));
        rosh_chodesh.add(new GregorianCalendar(2022, 3, 4));
        rosh_chodesh.add(new GregorianCalendar(2022, 4, 2));
        rosh_chodesh.add(new GregorianCalendar(2022, 5, 1));
        rosh_chodesh.add(new GregorianCalendar(2022, 5, 2));
        rosh_chodesh.add(new GregorianCalendar(2022, 5, 31));
        rosh_chodesh.add(new GregorianCalendar(2022, 6, 29));
        rosh_chodesh.add(new GregorianCalendar(2022, 6, 30));
        rosh_chodesh.add(new GregorianCalendar(2022, 7, 29));
        rosh_chodesh.add(new GregorianCalendar(2022, 8, 27));
        rosh_chodesh.add(new GregorianCalendar(2022, 8, 28));
        rosh_chodesh.add(new GregorianCalendar(2022, 9, 26));
        rosh_chodesh.add(new GregorianCalendar(2022, 10, 25));
        rosh_chodesh.add(new GregorianCalendar(2022, 10, 26));
        rosh_chodesh.add(new GregorianCalendar(2022, 11, 24));
        rosh_chodesh.add(new GregorianCalendar(2022, 11, 25));
        rosh_chodesh.add(new GregorianCalendar(2022, 12, 24));
        rosh_chodesh.add(new GregorianCalendar(2022, 12, 25));
        rosh_chodesh.add(new GregorianCalendar(2023, 1, 23));
        rosh_chodesh.add(new GregorianCalendar(2021, 10, 16));


        purim.add(new GregorianCalendar(2021,2,26));
        purim.add(new GregorianCalendar(2021, 2, 26));
        purim.add(new GregorianCalendar(2022, 3, 17));
        purim.add(new GregorianCalendar(2023, 3, 7));
        purim.add(new GregorianCalendar(2021, 9, 19));


        shushan_purim.add(new GregorianCalendar(2021, 2, 27));
        shushan_purim.add(new GregorianCalendar(2022, 3, 18));
        shushan_purim.add(new GregorianCalendar(2023, 3, 8));


        pesach.add(new GregorianCalendar(2021, 3, 28));
        pesach.add(new GregorianCalendar(2021, 3, 29));
        pesach.add(new GregorianCalendar(2021, 3, 30));
        pesach.add(new GregorianCalendar(2021, 3, 31));
        pesach.add(new GregorianCalendar(2021, 4, 1));
        pesach.add(new GregorianCalendar(2021, 4, 2));
        pesach.add(new GregorianCalendar(2021, 4, 3));

        pesach.add(new GregorianCalendar(2022, 4, 16));
        pesach.add(new GregorianCalendar(2022, 4, 17));
        pesach.add(new GregorianCalendar(2022, 4, 18));
        pesach.add(new GregorianCalendar(2022, 4, 19));
        pesach.add(new GregorianCalendar(2022, 4, 20));
        pesach.add(new GregorianCalendar(2022, 4, 21));
        pesach.add(new GregorianCalendar(2022, 4, 22));

        pesach.add(new GregorianCalendar(2023, 4, 6));
        pesach.add(new GregorianCalendar(2023, 4, 7));
        pesach.add(new GregorianCalendar(2023, 4, 8));
        pesach.add(new GregorianCalendar(2023, 4, 9));
        pesach.add(new GregorianCalendar(2023, 4, 10));
        pesach.add(new GregorianCalendar(2023, 4, 11));
        pesach.add(new GregorianCalendar(2023, 4, 12));


        sukkos.add(new GregorianCalendar(2021, 9, 21));
        sukkos.add(new GregorianCalendar(2021, 9, 22));
        sukkos.add(new GregorianCalendar(2021, 9, 23));
        sukkos.add(new GregorianCalendar(2021, 9, 24));
        sukkos.add(new GregorianCalendar(2021, 9, 25));
        sukkos.add(new GregorianCalendar(2021, 9, 26));
        sukkos.add(new GregorianCalendar(2021, 9, 27));

        sukkos.add(new GregorianCalendar(2022, 9, 10));
        sukkos.add(new GregorianCalendar(2022, 9, 11));
        sukkos.add(new GregorianCalendar(2022, 9, 12));
        sukkos.add(new GregorianCalendar(2022, 9, 13));
        sukkos.add(new GregorianCalendar(2022, 9, 14));
        sukkos.add(new GregorianCalendar(2022, 9, 15));
        sukkos.add(new GregorianCalendar(2022, 9, 16));

        sukkos.add(new GregorianCalendar(2023, 9, 30));
        sukkos.add(new GregorianCalendar(2023, 10, 1));
        sukkos.add(new GregorianCalendar(2023, 10, 2));
        sukkos.add(new GregorianCalendar(2023, 10, 3));
        sukkos.add(new GregorianCalendar(2023, 10, 4));
        sukkos.add(new GregorianCalendar(2023, 10, 5));
        sukkos.add(new GregorianCalendar(2023, 10, 6));


        chanukah.add(new GregorianCalendar(2021, 11,29));
        chanukah.add(new GregorianCalendar(2021, 11,30));
        chanukah.add(new GregorianCalendar(2021, 11,31));
        chanukah.add(new GregorianCalendar(2021, 12,1));
        chanukah.add(new GregorianCalendar(2021, 12,2));
        chanukah.add(new GregorianCalendar(2021, 12,3));
        chanukah.add(new GregorianCalendar(2021, 12,4));
        chanukah.add(new GregorianCalendar(2021, 12,5));

        chanukah.add(new GregorianCalendar(2022, 12,19));
        chanukah.add(new GregorianCalendar(2022, 12,20));
        chanukah.add(new GregorianCalendar(2022, 12,21));
        chanukah.add(new GregorianCalendar(2022, 12,22));
        chanukah.add(new GregorianCalendar(2022, 12,23));
        chanukah.add(new GregorianCalendar(2022, 12,24));
        chanukah.add(new GregorianCalendar(2022, 12,25));
        chanukah.add(new GregorianCalendar(2022, 12,26));

        chanukah.add(new GregorianCalendar(2023, 12,8));
        chanukah.add(new GregorianCalendar(2023, 12,9));
        chanukah.add(new GregorianCalendar(2023, 12,10));
        chanukah.add(new GregorianCalendar(2023, 12,11));
        chanukah.add(new GregorianCalendar(2023, 12,12));
        chanukah.add(new GregorianCalendar(2023, 12,13));
        chanukah.add(new GregorianCalendar(2023, 12,14));
        chanukah.add(new GregorianCalendar(2023, 12,15));


        tisha_baav.add(new GregorianCalendar(2022, 8, 7));
        tisha_baav.add(new GregorianCalendar(2023, 7, 27));
        tisha_baav.add(new GregorianCalendar(2024, 8, 13));


        tzom_gedalya.add(new GregorianCalendar(2022, 9, 28));
        tzom_gedalya.add(new GregorianCalendar(2023, 9, 18));
        tzom_gedalya.add(new GregorianCalendar(2024, 10, 6));


        asara_betevet.add(new GregorianCalendar(2021, 12, 14));
        asara_betevet.add(new GregorianCalendar(2023, 1, 3));
        asara_betevet.add(new GregorianCalendar(2023, 12, 22));


        taanis_ester.add(new GregorianCalendar(2022, 3, 16));
        taanis_ester.add(new GregorianCalendar(2023, 3, 6));
        taanis_ester.add(new GregorianCalendar(2024, 3, 21));


        shivaAsar_betammuz.add(new GregorianCalendar(2022, 7, 17));
        shivaAsar_betammuz.add(new GregorianCalendar(2023, 7, 6));
        shivaAsar_betammuz.add(new GregorianCalendar(2024, 6, 23));


    }

    public ArrayList<GregorianCalendar> getRosh_chodesh() {
        return rosh_chodesh;
    }

    public void setRosh_chodesh(ArrayList<GregorianCalendar> rosh_chodesh) {
        this.rosh_chodesh = rosh_chodesh;
    }

    public ArrayList<GregorianCalendar> getPurim() {
        return purim;
    }

    public void setPurim(ArrayList<GregorianCalendar> purim) {
        this.purim = purim;
    }

    public ArrayList<GregorianCalendar> getShushan_purim() {
        return shushan_purim;
    }

    public void setShushan_purim(ArrayList<GregorianCalendar> shushan_purim) {
        this.shushan_purim = shushan_purim;
    }

    public ArrayList<GregorianCalendar> getPesach() {
        return pesach;
    }

    public void setPesach(ArrayList<GregorianCalendar> pesach) {
        this.pesach = pesach;
    }

    public ArrayList<GregorianCalendar> getSukkos() {
        return sukkos;
    }

    public void setSukkos(ArrayList<GregorianCalendar> sukkos) {
        this.sukkos = sukkos;
    }

    public ArrayList<GregorianCalendar> getChanukah() {
        return chanukah;
    }

    public void setChanukah(ArrayList<GregorianCalendar> chanukah) {
        this.chanukah = chanukah;
    }

    public ArrayList<GregorianCalendar> getTisha_baav() {
        return tisha_baav;
    }

    public void setTisha_baav(ArrayList<GregorianCalendar> tisha_baav) {
        this.tisha_baav = tisha_baav;
    }

    public ArrayList<GregorianCalendar> getTzom_gedalya() {
        return tzom_gedalya;
    }

    public void setTzom_gedalya(ArrayList<GregorianCalendar> tzom_gedalya) {
        this.tzom_gedalya = tzom_gedalya;
    }

    public ArrayList<GregorianCalendar> getAsara_betevet() {
        return asara_betevet;
    }

    public void setAsara_betevet(ArrayList<GregorianCalendar> asara_betevet) {
        this.asara_betevet = asara_betevet;
    }

    public ArrayList<GregorianCalendar> getTaanis_ester() {
        return taanis_ester;
    }

    public void setTaanis_ester(ArrayList<GregorianCalendar> taanis_ester) {
        this.taanis_ester = taanis_ester;
    }

    public ArrayList<GregorianCalendar> getShivaAsar_betammuz() {
        return shivaAsar_betammuz;
    }

    public void setShivaAsar_betammuz(ArrayList<GregorianCalendar> shivaAsar_betammuz) {
        this.shivaAsar_betammuz = shivaAsar_betammuz;
    }
}
