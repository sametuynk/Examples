package com.sametuyanik.abstractexample2;

public abstract class Personel {

    static final String sirketIsmi="Yildiz Celik";
    static final String sirketAdresi="Ankara/TURKEY";


    protected String isim="";
    protected String soyisim="";
    protected String tcNo="";
    protected String telefon="";
    protected String iseBaslamaTarihi="";
    protected String sigortaNo="";

    static int personelSayac=100;

    protected String personelNo;

    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }

}
