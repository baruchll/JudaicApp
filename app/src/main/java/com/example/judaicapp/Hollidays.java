package com.example.judaicapp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Hollidays {

    Calendar calendar = GregorianCalendar.getInstance();



    public static ArrayList<GregorianCalendar> rosh_chodesh = new ArrayList<>();
    public static ArrayList<GregorianCalendar> purim = new ArrayList<>();
    public static ArrayList<GregorianCalendar> shushan_purim = new ArrayList<>();
    public static ArrayList<GregorianCalendar> pesach = new ArrayList<>();
    public static ArrayList<GregorianCalendar> sukkos = new ArrayList<>();
    public static ArrayList<GregorianCalendar> chanukah = new ArrayList<>();
    public static ArrayList<GregorianCalendar> tisha_baav = new ArrayList<>();
    public static ArrayList<GregorianCalendar> tzom_gedalya = new ArrayList<>();
    public static ArrayList<GregorianCalendar> asara_betevet = new ArrayList<>();
    public static ArrayList<GregorianCalendar> taanis_ester = new ArrayList<>();
    public static ArrayList<GregorianCalendar> shivaAsar_betammuz = new ArrayList<>();
    public static ArrayList<GregorianCalendar> omer_start = new ArrayList<>();
    public static ArrayList<GregorianCalendar> omer_end = new ArrayList<>();
    public static ArrayList<GregorianCalendar> moridHatalVetenBracha = new ArrayList<>();
    public static ArrayList<GregorianCalendar> vetenTal = new ArrayList<>();
    public static ArrayList<GregorianCalendar> mashiv = new ArrayList<>();
    public static ArrayList<GregorianCalendar> ayt = new ArrayList<>();



    public Hollidays(){



        rosh_chodesh.add(new GregorianCalendar(2021, 9, 6));
        rosh_chodesh.add(new GregorianCalendar(2021, 9, 7));
        rosh_chodesh.add(new GregorianCalendar(2021, 10, 5));
        rosh_chodesh.add(new GregorianCalendar(2021, 11, 4));
        rosh_chodesh.add(new GregorianCalendar(2021, 11, 5));
        rosh_chodesh.add(new GregorianCalendar(2022, 0, 3));
        rosh_chodesh.add(new GregorianCalendar(2022, 1, 1));
        rosh_chodesh.add(new GregorianCalendar(2022, 1, 2));
        rosh_chodesh.add(new GregorianCalendar(2022, 2, 3));
        rosh_chodesh.add(new GregorianCalendar(2022, 2, 4));
        rosh_chodesh.add(new GregorianCalendar(2022, 3, 2));
        rosh_chodesh.add(new GregorianCalendar(2022, 4, 1));
        rosh_chodesh.add(new GregorianCalendar(2022, 4, 2));
        rosh_chodesh.add(new GregorianCalendar(2022, 4, 31));
        rosh_chodesh.add(new GregorianCalendar(2022, 5, 29));
        rosh_chodesh.add(new GregorianCalendar(2022, 5, 30));
        rosh_chodesh.add(new GregorianCalendar(2022, 6, 29));
        rosh_chodesh.add(new GregorianCalendar(2022, 7, 27));
        rosh_chodesh.add(new GregorianCalendar(2022, 7, 28));
        rosh_chodesh.add(new GregorianCalendar(2022, 8, 26));
        rosh_chodesh.add(new GregorianCalendar(2022, 9, 25));
        rosh_chodesh.add(new GregorianCalendar(2022, 9, 26));
        rosh_chodesh.add(new GregorianCalendar(2022, 10, 24));
        rosh_chodesh.add(new GregorianCalendar(2022, 10, 25));
        rosh_chodesh.add(new GregorianCalendar(2022, 11, 24));
        rosh_chodesh.add(new GregorianCalendar(2022, 11, 25));
        rosh_chodesh.add(new GregorianCalendar(2023, 0, 23));
        rosh_chodesh.add(new GregorianCalendar(2021, 1, 16));

        mashiv.add(new GregorianCalendar(2021, 9, 28));
        mashiv.add(new GregorianCalendar(2022, 9, 16));
        mashiv.add(new GregorianCalendar(2023, 9, 6));

        ayt.add(new GregorianCalendar(2022, 8, 28));
        ayt.add(new GregorianCalendar(2022, 8, 29));
        ayt.add(new GregorianCalendar(2022, 8, 30));
        ayt.add(new GregorianCalendar(2022, 9, 1));
        ayt.add(new GregorianCalendar(2022, 9, 2));
        ayt.add(new GregorianCalendar(2022, 9, 3));
        ayt.add(new GregorianCalendar(2022, 9, 4));
        ayt.add(new GregorianCalendar(2023, 8, 18));
        ayt.add(new GregorianCalendar(2023, 8, 19));
        ayt.add(new GregorianCalendar(2023, 8, 20));
        ayt.add(new GregorianCalendar(2023, 8, 21));
        ayt.add(new GregorianCalendar(2023, 8, 22));
        ayt.add(new GregorianCalendar(2023, 8, 23));
        ayt.add(new GregorianCalendar(2023, 8, 24));
        ayt.add(new GregorianCalendar(2024, 9, 5));
        ayt.add(new GregorianCalendar(2024, 9, 6));
        ayt.add(new GregorianCalendar(2024, 9, 7));
        ayt.add(new GregorianCalendar(2024, 9, 8));
        ayt.add(new GregorianCalendar(2024, 9, 9));
        ayt.add(new GregorianCalendar(2024, 9, 10));
        ayt.add(new GregorianCalendar(2024, 9, 11));



        purim.add(new GregorianCalendar(2021,1,26));
        purim.add(new GregorianCalendar(2021, 1, 26));
        purim.add(new GregorianCalendar(2022, 2, 17));
        purim.add(new GregorianCalendar(2023, 2, 7));


        shushan_purim.add(new GregorianCalendar(2021, 1, 27));
        shushan_purim.add(new GregorianCalendar(2022, 2, 18));
        shushan_purim.add(new GregorianCalendar(2023, 2, 8));

        moridHatalVetenBracha.add(new GregorianCalendar(2021, 2, 29));
        moridHatalVetenBracha.add(new GregorianCalendar(2022, 3, 17));
        moridHatalVetenBracha.add(new GregorianCalendar(2023, 3, 7));

        vetenTal.add(new GregorianCalendar(2021, 9, 13));
        vetenTal.add(new GregorianCalendar(2022, 10, 1));
        vetenTal.add(new GregorianCalendar(2023, 9, 22));



        pesach.add(new GregorianCalendar(2021, 2, 28));
        pesach.add(new GregorianCalendar(2021, 2, 29));
        pesach.add(new GregorianCalendar(2021, 2, 30));
        pesach.add(new GregorianCalendar(2021, 2, 31));
        pesach.add(new GregorianCalendar(2021, 3, 1));
        pesach.add(new GregorianCalendar(2021, 3, 2));
        pesach.add(new GregorianCalendar(2021, 3, 3));

        pesach.add(new GregorianCalendar(2022, 3, 16));
        pesach.add(new GregorianCalendar(2022, 3, 17));
        pesach.add(new GregorianCalendar(2022, 3, 18));
        pesach.add(new GregorianCalendar(2022, 3, 19));
        pesach.add(new GregorianCalendar(2022, 3, 20));
        pesach.add(new GregorianCalendar(2022, 3, 21));
        pesach.add(new GregorianCalendar(2022, 3, 22));

        pesach.add(new GregorianCalendar(2023, 3, 6));
        pesach.add(new GregorianCalendar(2023, 3, 7));
        pesach.add(new GregorianCalendar(2023, 3, 8));
        pesach.add(new GregorianCalendar(2023, 3, 9));
        pesach.add(new GregorianCalendar(2023, 3, 10));
        pesach.add(new GregorianCalendar(2023, 3, 11));
        pesach.add(new GregorianCalendar(2023, 3, 12));


        sukkos.add(new GregorianCalendar(2021, 8, 21));

        sukkos.add(new GregorianCalendar(2022, 8, 10));

        sukkos.add(new GregorianCalendar(2023, 8, 30));



        chanukah.add(new GregorianCalendar(2021, 9, 18));
        chanukah.add(new GregorianCalendar(2021, 10,29));
        chanukah.add(new GregorianCalendar(2021, 10,30));
        chanukah.add(new GregorianCalendar(2021, 10,31));
        chanukah.add(new GregorianCalendar(2021, 11,1));
        chanukah.add(new GregorianCalendar(2021, 11,2));
        chanukah.add(new GregorianCalendar(2021, 11,3));
        chanukah.add(new GregorianCalendar(2021, 11,4));
        chanukah.add(new GregorianCalendar(2021, 11,5));

        chanukah.add(new GregorianCalendar(2022, 11,19));
        chanukah.add(new GregorianCalendar(2022, 11,20));
        chanukah.add(new GregorianCalendar(2022, 11,21));
        chanukah.add(new GregorianCalendar(2022, 11,22));
        chanukah.add(new GregorianCalendar(2022, 11,23));
        chanukah.add(new GregorianCalendar(2022, 11,24));
        chanukah.add(new GregorianCalendar(2022, 11,25));
        chanukah.add(new GregorianCalendar(2022, 11,26));

        chanukah.add(new GregorianCalendar(2023, 11,8));
        chanukah.add(new GregorianCalendar(2023, 11,9));
        chanukah.add(new GregorianCalendar(2023, 11,10));
        chanukah.add(new GregorianCalendar(2023, 11,11));
        chanukah.add(new GregorianCalendar(2023, 11,12));
        chanukah.add(new GregorianCalendar(2023, 11,13));
        chanukah.add(new GregorianCalendar(2023, 11,14));
        chanukah.add(new GregorianCalendar(2023, 11,15));


        tisha_baav.add(new GregorianCalendar(2022, 7, 7));
        tisha_baav.add(new GregorianCalendar(2023, 6, 27));
        tisha_baav.add(new GregorianCalendar(2024, 7, 13));


        tzom_gedalya.add(new GregorianCalendar(2022, 8, 28));
        tzom_gedalya.add(new GregorianCalendar(2023, 8, 18));
        tzom_gedalya.add(new GregorianCalendar(2024, 9, 6));


        asara_betevet.add(new GregorianCalendar(2021, 11, 14));
        asara_betevet.add(new GregorianCalendar(2023, 0, 3));
        asara_betevet.add(new GregorianCalendar(2023, 11, 22));


        taanis_ester.add(new GregorianCalendar(2022, 2, 16));
        taanis_ester.add(new GregorianCalendar(2023, 2, 6));
        taanis_ester.add(new GregorianCalendar(2024, 2, 21));


        shivaAsar_betammuz.add(new GregorianCalendar(2022, 6, 17));
        shivaAsar_betammuz.add(new GregorianCalendar(2023, 6, 6));
        shivaAsar_betammuz.add(new GregorianCalendar(2024, 5, 23));

        omer_start.add(new GregorianCalendar(2022, 9, 16));
        omer_start.add(new GregorianCalendar(2021, 9, 23));
        omer_end.add(new GregorianCalendar(2022, 11, 23));
        omer_end.add(new GregorianCalendar(2021, 11, 25));


    }

    public static ArrayList<GregorianCalendar> getOmer_start() {
        return omer_start;
    }

    public static void setOmer_start(ArrayList<GregorianCalendar> omer_start) {
        Hollidays.omer_start = omer_start;
    }

    public static ArrayList<GregorianCalendar> getOmer_end() {
        return omer_end;
    }

    public static void setOmer_end(ArrayList<GregorianCalendar> omer_end) {
        Hollidays.omer_end = omer_end;
    }

    public ArrayList<GregorianCalendar> getPurim() {
        return purim;
    }

    public void setPurim(ArrayList<GregorianCalendar> purim) {
        Hollidays.purim = purim;
    }

    public ArrayList<GregorianCalendar> getShushan_purim() {
        return shushan_purim;
    }

    public void setShushan_purim(ArrayList<GregorianCalendar> shushan_purim) {
        Hollidays.shushan_purim = shushan_purim;
    }

    public ArrayList<GregorianCalendar> getPesach() {
        return pesach;
    }

    public void setPesach(ArrayList<GregorianCalendar> pesach) {
        Hollidays.pesach = pesach;
    }

    public ArrayList<GregorianCalendar> getSukkos() {
        return sukkos;
    }

    public void setSukkos(ArrayList<GregorianCalendar> sukkos) {
        Hollidays.sukkos = sukkos;
    }

    public ArrayList<GregorianCalendar> getChanukah() {
        return chanukah;
    }

    public void setChanukah(ArrayList<GregorianCalendar> chanukah) {
        Hollidays.chanukah = chanukah;
    }

    public ArrayList<GregorianCalendar> getTisha_baav() {
        return tisha_baav;
    }

    public void setTisha_baav(ArrayList<GregorianCalendar> tisha_baav) {
        Hollidays.tisha_baav = tisha_baav;
    }

    public ArrayList<GregorianCalendar> getTzom_gedalya() {
        return tzom_gedalya;
    }

    public void setTzom_gedalya(ArrayList<GregorianCalendar> tzom_gedalya) {
        Hollidays.tzom_gedalya = tzom_gedalya;
    }

    public ArrayList<GregorianCalendar> getAsara_betevet() {
        return asara_betevet;
    }

    public void setAsara_betevet(ArrayList<GregorianCalendar> asara_betevet) {
        Hollidays.asara_betevet = asara_betevet;
    }

    public ArrayList<GregorianCalendar> getTaanis_ester() {
        return taanis_ester;
    }

    public void setTaanis_ester(ArrayList<GregorianCalendar> taanis_ester) {
        Hollidays.taanis_ester = taanis_ester;
    }

    public ArrayList<GregorianCalendar> getShivaAsar_betammuz() {
        return shivaAsar_betammuz;
    }

    public void setShivaAsar_betammuz(ArrayList<GregorianCalendar> shivaAsar_betammuz) {
        Hollidays.shivaAsar_betammuz = shivaAsar_betammuz;
    }
}
