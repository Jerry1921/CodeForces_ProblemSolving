import java.util.*;

public class prob_479A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int firstComb = a + (b * c);
        int secondComb = a * (b + c);
        int thirdComb = a * b * c;
        int fourthComb = (a + b) * c;
        int fifthComb = a + b + c;
        int sixthComb = (a + b) * c;

        List<Integer> numbers = Arrays.asList(firstComb, secondComb, thirdComb,
                fourthComb, fifthComb, sixthComb);
        int max = Collections.max(numbers);

        System.out.println(max);

    }
}
