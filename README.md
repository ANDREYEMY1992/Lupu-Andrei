1. Given an interval [a,b], determine largest prime number that is equal to the longest sum of consecutive primes.
Eg:
In the interval [3,25] there are 8 prime numbers: 3, 5, 7, 11, 13, 17, 19, 23
 
3 = 3 (one term)
5 = 2+3 (two terms)
7 - cannot be written as a sum of consecutive primes
11 - cannot be written as a sum of consecutive primes
13 = cannot be written as a sum of consecutive primes
17 = 2 + 3 + 5 + 7 (4 terms)
19 = cannot be written as a sum of consecutive primes
23 = 5 + 7 + 11 (3 terms)
 
The longest sum is 2 + 3 + 5 + 7 and the expected result is 17.
Other remarks:
If several sums have the maximum number of terms, the largest prime is returned.
One prime can only be used once in a sum(eg: 7 cannot be written as 2+2+3)
