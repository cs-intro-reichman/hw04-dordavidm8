public class Primes {
    public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    boolean[] isPrime = new boolean[num + 1];
    int counter = 0;
    for (int i = 2; i <= num; i++) {
    isPrime[i] = true;
}
   for (int i = 2; i <= Math.sqrt(num); i++) {
        if (isPrime[i] == true) {
            for (int j = i * i; j <= num; j = j + i) {
                isPrime[j] = false; 
            }
        }
    }    
    System.out.println("Prime numbers up to " + num + ":");
    for (int i = 2; i <= num; i++) {
        if (isPrime[i]) {
            System.out.println(i); 
            counter++ ;
        }
    }
    double percent = ((double) counter / num) * 100;
    System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)", 
    counter, num, percent);  
  }
}