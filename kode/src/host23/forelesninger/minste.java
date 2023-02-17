package host23.forelesninger;

public class minste {
    static int minPosisjon(int[] liste){
        int minste = liste[0];
        int minstePosisjon = 0;
        for(int i = 1; i < liste.length; i++){
            if (liste[i] < minste){
                minste = liste[i];
                minstePosisjon = i;
            }
        }
        return minstePosisjon;
    }

    public static void main(String[] args) {
        int[] liste = {4,7,23,1,56};
        int min = minPosisjon(liste);
        System.out.println("Posisjon til det minste tallet i listen er: " + minPosisjon(liste));
        System.out.println("Det minste tallet er " + liste[min]);
    }
}
