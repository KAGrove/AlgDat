package forelesninger;

public class F3_JavaGenerics2 {
    public static void main(String[] args) {
        Integer[] x = {12, 3, 45, 9, 99, 0, 6, 8};

        Pokemon[] pokemons = {
                new Pokemon("Blastoise", 10, 1000),
                new Pokemon("Pikachu", 8, 500),
                new Pokemon("Charmander", 7, 120),
                new Pokemon("Jigglypuff", 10, 500),
                new Pokemon("Blastoise", 10, 1001),
                new Pokemon("Blestoise", 10, 1001)
        };

        for (Pokemon p : pokemons){
            System.out.println(pokemons);
        }

/*        TestKomparator cmp = new TestKomparator();*/
        System.out.println(x[0].compareTo(x[2]));
    }



    public static class Pokemon{
        String name;
        Integer level;
        Integer hp;

        Pokemon(String name, int level, int hp) {
            this.name = name;
            this.level = level;
            this.hp = hp;
        }

        public String toString(){
            return name + " (" + level +"," + hp +")";
        }
    }

/*    public class StigendePokemonKomparator implements Komparator<Pokemon>{
        public int compare(Pokemon p1, Pokemon p2){
            int out = p1.level.compareTo(p2.level);
            if (out ==0){
                out = p1.hp.compareTo(p2.hp);
            }
            if (out == 0){
                out = p1.name.compareTo(p2.name);
            }
            return out;
        }*/

        public class SynkendePokemonKomparator implements Komparator<Pokemon>{
            public int compare(Pokemon p1, Pokemon p2){
                int out = p1.level.compareTo(p2.level);
                if (out ==0){
                    out = p1.hp.compareTo(p2.hp);
                }
                if (out == 0){
                    out = p1.name.compareTo(p2.name);
                }
                return out;
            }

    }


















    @FunctionalInterface
    public interface  Komparator <T>{
        int compare(T x, T y);
    }

/*    public static class TestKomparator implements  Komparator<Integer>{
        public int compare(Integer other){
            return this - other;
        }
    }*/












    public static <T extends Comparable<? super T>> int maks(T[] x, int fra, int til){
        int mi = fra;
        T mv = x[mi];
        for (int i = fra + 1; i < til; i++){
            if (x[i].compareTo(mv) > 0){            // Ikke (x[i] > mv)
                mi = i;
                mv = x[mi];
            }
        }

        return mi;
    }

    public static <T extends Comparable<? super T>> int maks(T[] x){
        return maks(x, 0, x.length);
    }

    public static <T extends  Comparable<? super T >> void insettingssortering(T[] x){
        int mi = maks(x);
    }
}
