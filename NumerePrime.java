package ProblemaPentalog;

import java.util.*;

public class NumerePrime {
    static int n, status = 1, num = 2;

    public void metodacitire(){
	Scanner in = new Scanner(System.in);
	System.out.println("Numerele prime pe care le vrei sa le afisezi: ");
	n = in.nextInt();

	if (n >= 1) {
	    System.out.println("Primele " + n + " numere prime de la cifra "
		    + num + " sunt:-");
	}
    }
    public void metodaPrim(){
	Collection<Integer> listaIntregiPrimi = new ArrayList<Integer>();
	for (int i = 1; i <= n;) {
	    for (int j = 2; j < num; j++) {
		if (num % j == 0) {
		    status = 0;
		    break;
		}
	    }
	    if (status != 0) {
		System.out.println(num + "");
		listaIntregiPrimi.add(num);
		i++;
	    }
	    status = 1;
	    num++;
	}
	Integer[] numerePrime = new Integer[100];
	listaIntregiPrimi.toArray(numerePrime);
	for (int i = 0; i < numerePrime.length; i++) {
	    int temp = 0;
	    for (int k = 0; k < i; k++) {

		if (numerePrime[k] != null && numerePrime[i] != null) {
		    temp += numerePrime[k];
		    if (temp == numerePrime[i]) {
			System.out.print("numarul "
					+ numerePrime[i]
					+ " se poate scrie ca suma de numere prime mai mici \n");
			k = 0;
			break;
		    }
		   //afiseaza doar cateva numere ce se pot scrie ca suma de alte
		   //numere mai mici prime consecutive...
		}
	    }
	}
    }
}
