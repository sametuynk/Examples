package com.sametuyanik.abstractexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isci isci1=new isci();

        isci1.saatUcreti=isci1.saatUcreti();
        isci1.aylikCalismaSuresi=isci1.AylikCalismaSuresi();
        isci1.personelNo=isci1.personelNo();

        isci1.maas=isci1.maas(isci1.saatUcreti,isci1.aylikCalismaSuresi);
        isci1.isim="Samet";
        isci1.soyisim="Uyanık";
        isci1.iseBaslamaTarihi="17.08.2022";
        isci1.sigortaNo="12";
        isci1.tcNo="12345678912";
        isci1.telefon="05423528587";

        System.out.println(isci1);
        System.out.println("-------------------------------------------------");

        Memur memur=new Memur();

        memur.saatUcreti=memur.saatUcreti();
        memur.aylikCalismaSuresi=memur.AylikCalismaSuresi();
        memur.personelNo=memur.personelNo();

        memur.maas=memur.maas(memur.saatUcreti,memur.aylikCalismaSuresi);
        memur.isim="Berat";
        memur.soyisim="Uyanık";
        memur.iseBaslamaTarihi="11.02.2022";
        memur.sigortaNo="19";
        memur.tcNo="12345678912";
        memur.telefon="05423528587";
        System.out.println(memur);

        System.out.println("-------------------------------------------------");

        Usta usta=new Usta();
        usta.saatUcreti= usta.saatUcreti();
        usta.aylikCalismaSuresi= usta.AylikCalismaSuresi();
        usta.personelNo= usta.personelNo();
        usta.maas=usta.maas(usta.saatUcreti,usta.aylikCalismaSuresi);
        usta.isim="Ali";
        usta.soyisim="Uyanık";
        usta.iseBaslamaTarihi="15.05.2022";
        usta.sigortaNo="14";
        usta.tcNo="12345678912";
        usta.telefon="05423528587";
        System.out.println(usta);









    }

}