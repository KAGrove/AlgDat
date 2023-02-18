package host23.oblig1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class oppgave1Test {

    @Test
    void maks() {
        int[] a = {8,4,0,19};
        int maksimum = oppgave1.maks(a);
        assertEquals(19, maksimum);
    }
}