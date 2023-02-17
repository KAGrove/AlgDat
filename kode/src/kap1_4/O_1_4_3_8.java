package kap1_4;

// Det kan oppstå tvetydigheter hvis primitive typer og omslagsklasser blandes. Metoden public static void f(int a, Integer b) { }
// har først en int og så en Integer som argument. I metoden public static void f(Integer a, int b) { }  er det motsatt.
// Dermed er disse metodene forskjellige. Hva vil kompilatoren si til metodekallet f(1,1); Hva skjer hvis en av metodene kommenteres vekk?
// Hvis begge metodene finnes, hvordan kan en da endre i kallet f(1,1); for at en bestemt av dem skal brukes?

// https://www.cs.hioa.no/~ulfu/appolonius/kap1/4/fasit143.html

//  f(1, (Integer)1);  // nå brukes f(int a, Integer b)
//  f((Integer)1,1);   // f(Integer a, int b)

public class O_1_4_3_8 {
}
