import java.util.Scanner;

public class prob_1367A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        while (t-- > 0){
            String myString = sc.next();

//            char[] charArray = myString.toCharArray();
//
//            for (int i = 0; i < charArray.length; i++){
//                for (int j = 1; j < charArray.length; j++){
//                    if (charArray[i] == charArray[j]){
//
//                    }
//                }
//            }

            StringBuilder result = new StringBuilder();

            result.append(myString.charAt(0));

            for (int i = 1; i < myString.length() - 1; i += 2){
                result.append(myString.charAt(i));
            }

            result.append(myString.charAt(myString.length() - 1));

            System.out.println(result);

//            for (char ch : charArray){
//                System.out.println(ch + " ");
//            }
        }
    }
}
