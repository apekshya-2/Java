public class PrimeGenerator {
    private int n;

    public PrimeGenerator(int n) {
        this.n = n;
    }

    public void printFirstNPrimes() {
        int count = 0;
        int number = 2;

        System.out.println("First " + n + " prime numbers:");

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 10; // Change this value to print the first n prime numbers

        PrimeGenerator primeGenerator = new PrimeGenerator(n);
        primeGenerator.printFirstNPrimes();
    }
}
