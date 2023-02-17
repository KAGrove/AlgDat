package forelesninger;

public class F2_JavaGenerics1 {
    public static void main(String[] args) {
        for (int x = -10; x <= 10; x++){
            System.out.println(x + " " + ternaryIntervalCheck(x));
        }

        int[] v1 = {2,4,10,2,3,99,4,0};

        char[] c = {'A', 'F', 'H', 'Z', 'L', 'P'};
        System.out.println(maksChar(c));

        Integer[] v2 = {2,4,10,2,3,99,4,0};
        System.out.println(maks(v2));

        Character[] c2 = {'A', 'F', 'H', 'Z', 'L', 'P'};
        System.out.println(maks(c2));

        String[] s = {"Algdat", "Er", "Kjempe", "Gøy", "!"};      // Står mellom Algdat og Kjempe. K etter A.
        System.out.println(maks(s));

        Pokemon[] pokemons = {
                new Pokemon("Blastoise", 10, 1000),
                new Pokemon("Pikachu", 8, 500),
                new Pokemon("Charmander", 7, 120),
                new Pokemon("Jigglypuff", 10, 500),
                new Pokemon("Blastoise", 10, 1001),
                new Pokemon("Blestoise", 10, 1001)
        };

        System.out.println();
        System.out.println("Gotta catch 'em all!");
        for (Pokemon p: pokemons){
            System.out.println(p);
        }

        System.out.println(pokemons[maks(pokemons)] + "jeg velger deg!");

        System.out.println(pokemons[0].compareTo(pokemons[1]));
    }

    public static int simpleIntervalCheck(int x){
        // Returner -1 hvis x < -5 og 1 hvis x >= 5
        // Tungvindt

        int out = 0;
        if (x < -5){
            out--;
        }
        else {
            out++;
        }
        return out;
    }

    public static int ternaryIntervalCheck(int x){
        return (x<-5) ? -1 : (x > 5) ? 1 : 0;          // Kompakt, men vanskelig å lese
    }

    // ---------------------------------------------------------------------------------

    public static int maksInt(int[] x){                    // Returnerer indeks til største verdi
        int mi = 0;
        int mv = x[mi];
        for (int i = 1; i < x.length; i++){
            if (x[i] > mv){
                mi = i;
                mv = x[mi];
            }
        }

        return 0;
    }

    public static int maksChar(char[] c){                    // Returnerer indeks til største verdi
        int mi = 0;
        int mv = c[mi];
        for (int i = 1; i < c.length; i++){
            if (c[i] > mv){
                mi = i;
                mv = c[mi];
            }
        }

        return mi;
    }

    // Comparabel-interface, så man kan bruke flere ulike datatyper:
    public static <T extends Comparable<? super T>> int maks(T[] x){
        int mi = 0;
        T mv = x[mi];
        for (int i = 1; i < x.length; i++){
            if (x[i].compareTo(mv) > 0){            // Ikke (x[i] > mv)
                mi = i;
                mv = x[mi];
            }
        }

        return mi;
    }


    public static class Pokemon implements Comparable<Pokemon>{
        String name;
        Integer level;
        Integer hp;

        Pokemon(String name, int level, int hp){
            this.name = name;
            this.level = level;
            this.hp = hp;
        }

        public int compareTo(Pokemon otherPokemon){
            // 1: Sammenligner level
            int out = this.level.compareTo(otherPokemon.level);

            // 2: Sammenligner hp
            if (out == 0){
                out = this.hp.compareTo(otherPokemon.hp);
            }

            // 3: Sammenligner navn
            if(out == 0){
                out = this.name.compareTo(otherPokemon.name);
            }


            return out;
        }

        public String toString(){
            return name + " (" + level +"," + hp +")";
        }
    }
}
