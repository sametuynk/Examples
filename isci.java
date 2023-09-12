package com.sametuyanik.abstractexample2;

public class isci extends Muhasebe{
    @Override


    protected int saatUcreti() {
        return 50;
    }

    @Override
    protected int AylikCalismaSuresi() {
        return 300;
    }

    @Override
    public String toString() {
        return "  --isci--" +
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
