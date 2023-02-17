package kap1_4;

// Gitt tabellen: double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};  Lag kode som lager en Double-tabell ved hjelp av den gitte
// double-tabellen og som så bruker den generiske innsettingssorteringen. Se Programkode 1.4.3 c).

import hjelpeklasser.Tabell;

public class O_1_4_3_7 {
    public static void main(String[] args) {
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        Double[] e = new Double[d.length];
        for (int i = 0; i < e.length; i++){
            e[i] = d[i];
        }

        Tabell.skrivln(e);
        Tabell.innsettingssortering(e);
        Tabell.skrivln(e);
    }
}
