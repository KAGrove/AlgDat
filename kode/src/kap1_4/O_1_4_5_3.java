package kap1_4;

import hjelpeklasser.Måned;

public class O_1_4_5_3 {
    public static void main(String... args)
    {
        for (Måned m : Måned.høst())
        {
            System.out.println(m.toString() + " (" + m.name() + ") " + m.mndnr());
        }

        // september (SEP) 9
        // oktober (OKT) 10
    }
}
