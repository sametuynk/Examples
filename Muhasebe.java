package com.sametuyanik.abstractexample2;

public abstract class Muhasebe extends Personel {

    protected int saatUcreti;
    protected int aylikCalismaSuresi;
    protected int maas;


    protected abstract int saatUcreti();
    protected abstract int AylikCalismaSuresi();

    protected int maas(int saatUcreti,int aylikCalismaSuresi){
        int maas=saatUcreti*aylikCalismaSuresi;
        return maas;
    }


}
