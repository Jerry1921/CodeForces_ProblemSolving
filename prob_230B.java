import java.util.*;

public class prob_230B {


   /* public static boolean isPrime(long n){
        if (n < 2){
            return false;
        }
        for (long i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;

    }*/



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        //ArrayList<Integer> divisors = new ArrayList<Integer>();


        //Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        int LIMIT = 1000000;

        // Sieve of Eratosthenes
        boolean[] isPrime = new boolean[LIMIT + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= LIMIT; i++){
            if (isPrime[i]){
                // We mark every sqr root values as false step by step
                // first 2,4,6,8...
                // then 3,6,9...
                for (int j = i * i; j <= LIMIT; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for (long x : arr){
            //long x = arr[i];

            long root = (long) Math.sqrt(x);

            if (root * root == x && isPrime[(int)root]){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
