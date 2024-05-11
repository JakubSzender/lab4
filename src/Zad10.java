public class Zad10 {
    public void Init(){
        int n = 20;
        int result = findLargestPrime(n);

        System.out.println("Największa liczba pierwsza mniejsza od " + n + ": " + result);
    }

    public static int findLargestPrime(int n) {
        boolean[] primes = new boolean[n];

        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = n - 1; i >= 2; i--) {
            if (primes[i]) {
                return i;
            }
        }

        return 2;
    }
}
