import java.util.Scanner;

public class Prime{
    // variables
    int number;

    public Prime(int n) {
        number = n;
    }

    public String isPrime() {
        int i;
        String primeDecider = "The number is prime.";
        for(i = 2; i < number; i++) {
            if(number % i == 0) {
                primeDecider = "The number is not prime.";
            } 
        }
        return primeDecider;
    }

    public static void main(String[] args) {
        int n;
        Scanner Input = new Scanner(System.in);
        try {
            System.out.println("Enter an integer to see if it is prime: ");
            n = Input.nextInt();
        } finally {
            if(Input!=null) {
                Input.close();
            }
        }
        Prime isPrime = new Prime(n);
        String isPrimeOrNot = isPrime.isPrime();

        System.out.println(isPrimeOrNot);
    }
}