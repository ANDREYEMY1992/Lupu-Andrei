package Problema_Pentalog;

import java.util.*;

public class PrimeNumbers {
    static int n, status = 1, num = 2;

    public void methodread(){
	Scanner in = new Scanner(System.in);
	System.out.println("Numerele prime pe care le vrei sa le afisezi: ");
	n = in.nextInt();

	if (n >= 1) {
	    System.out.println("Primele " + n + " numere prime de la cifra "
		    + num + " sunt:-");
	}
    }
    public void methodPrim(){
	Collection<Integer> Primelist = new ArrayList<Integer>();
	for (int i = 1; i <= n;) {
	    for (int j = 2; j < num; j++) {
		if (num % j == 0) {
		    status = 0;
		    break;
		}
	    }
	    if (status != 0) {
		System.out.println(num + "");
		Primelist.add(num);
		i++;
	    }
	    status = 1;
	    num++;
	}
	Integer[] numbersprime = new Integer[100];
	Primelist.toArray(numbersprime);
	for (int i = 0; i < numbersprime.length; i++) {
	    int temp = 0;
	    for (int k = 0; k < i; k++) {

		if (numbersprime[k] != null && numbersprime[i] != null) {
		    temp += numbersprime[k];
		    if (temp == numbersprime[i]) {
			System.out.print("numarul "
					+ numbersprime[i]
					+ " se poate scrie ca suma de numere prime mai mici \n");
			k = 0;
			break;
		    }
		}
	    }
	}
    }
}
