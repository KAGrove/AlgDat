package host23.oblig1UtenSkall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class oppgave1Test {

    private Object NoSuchElementException;

    @Test
    void maks() {
        int[] a1 = {8,4,0,19};
        int maksimum = oppgave1.maks(a1);
        assertEquals(19, maksimum);

//        int[] a2 = {};
//        int feil = oppgave1.maks(a2);
//        System.out.println(feil);

    }

    @Test
    void testMaks() {
    }

    @Test
    void ombyttinger() {
        int[] a3 = {8,4,0,19,5,2,9};
        int ombyttinger = oppgave1.ombyttinger(a3);
        assertEquals(5, ombyttinger);
        System.out.println("Antall ombyttinger: " + ombyttinger);
    }
}