package com.company;

public class Main {

    public static void main(String[] args) {
        Lists lists=new Lists();
        lists.basaEkle(2);
        lists.basaEkle(7);
        lists.sonaEkle(5);
        lists.sonaEkle(6);
        lists.arayaEkle(12,1);
        lists.arayaEkle(117,2);
        lists.bastanSilme();
        lists.sondanSilme();
        lists.aradanSilme(1);

        lists.goster();

    }
}
