package host23.eksamen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class E2017O2 {
    public interface Iterable<T>
    {
        Iterator<T> iterator();

        public static <T> T maks(Iterable<T> s, Comparator<? super T> c){
            Iterator<T> i = s.iterator();
            if(!i.hasNext()) throw new NoSuchElementException("s er tom!");

            T maks = i.next();

            while (i.hasNext()){
                T verdi = i.next();
                if(c.compare(verdi, maks) > 0) maks = verdi;
            }
            return maks;
        }
    }
}
