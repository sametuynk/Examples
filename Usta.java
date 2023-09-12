package com.sametuyanik.abstractexample2;

public class Usta extends isci{


    @Override
    protected int saatUcreti() {
        return 75 ;
    }

    @Override
    protected int AylikCalismaSuresi() {
        return 300 ;
    }

    @Override
    public String toString() {
        return "  --Usta--" +
                "\n Şirket İsmi=" + sirketIsmi +
                "\n Şirket Adresi=" + sirketAdresi +
                "\n saatUcreti=" + saatUcreti +
                "\n aylikCalismaSuresi=" + aylikCalismaSuresi +
                "\n maas=" + maas +
                "\n isim='" + isim + '\'' +
                "\n soyisim='" + soyisim + '\'' +
                "\n tcNo='" + tcNo + '\'' +
                "\n telefon='" + telefon + '\'' +
                "\n iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                "\n sigortaNo='" + sigortaNo + '\'' +
                "\n personelNo='" + personelNo + '\'' +
                ' ';
    }
}
