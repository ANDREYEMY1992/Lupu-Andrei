package Problema_Pentalog;

import java.util.*;

public class PrimeNumbers {
    static int n, status = 1, num = 2; //n -> a variable that generates many primes as we
                                      //status -> a variable that helps to generate prime numbers
                                      //num -> initial number (starting point)
    public void methodread(){
	Scanner in = new Scanner(System.in); // create an instance of the class System
	System.out.println("Prime numbers that you want to display: ");
	n = in.nextInt();

	if (n >= 1) {
	    System.out.println("First " + n + " primes of the numbers "
		    + num + " are:-"); 
	}
    }
    public void methodPrim(){ // method which calculates prime numbers
	Collection<Integer> Primelist = new ArrayList<Integer>(); // create an instance of ArrayList
	for (int i = 1; i <= n;) {
	    for (int j = 2; j < num; j++) {
		if (num % j == 0) {
		    status = 0;
		    break;
		}
	    }
	    if (status != 0) {
		System.out.println(num + ""); //Show numbers prime
		Primelist.add(num); // store in the variable primes Primelist
		i++;
	    }
	    status = 1;
	    num++;
	}
	Integer[] numbersprime = new Integer[100]; // create a court to browse prime numbers
	Primelist.toArray(numbersprime);
	for (int i = 0; i < numbersprime.length; i++) {
	    int temp = 0; // create a variable to help us gather past numbers
	    for (int k = 0; k < i; k++) {

		if (numbersprime[k] != null && numbersprime[i] != null) {
		    temp += numbersprime[k]; // gather the previous numbers in temp until temp is equal
		    if (temp == numbersprime[i]) { //number prim to iterative i
			System.out.print("number "
					+ numbersprime[i]
					+ " can be written as the sum of primes less. \n");
			k = 0;
			break;
		    }
		}
	    }
	}
    }
}
