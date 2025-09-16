import java.util.Scanner;

public class prob_236A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();

       /* char[] charArray1 = new char[inputString.length()];

        char[] charArray2 = new char[inputString.length()];

        int count = 0;

        for (int i = 0; i<inputString.length(); i++) {
            charArray1[i] = inputString.charAt(i);

            charArray2[i] = inputString.charAt(i);

            //System.out.println(charArray[i]);

            //System.out.println(inputString.charAt(i));

            if (charArray1[i] == charArray2[i]) {
                count++;


            }
        }
        System.out.println(count);

        //if (charArray[i]==)
        *//*for (int j = 0; j<inputString.length(); j++) {
            if (charArray[j] != inputString.charAt(j)) {
                count++;
            }
        }
        System.out.println(charArray[0]);

        System.out.println(count);

        char charAtindex1 = inputString.charAt(4);

        System.out.println(charAtindex1);*//*

        char charAtindex1 = inputString.charAt(0);

        System.out.println(charAtindex1);*/

        int uniquecount = 0;

        for (int i = 0; i < inputString.length(); i++){
            char current = inputString.charAt(i);
            boolean alreadySeen = false;

            for (int j = 0; j<i; j++){
                if (inputString.charAt(j) == current){
                    alreadySeen = true;
                    break;
                }
            }

            if (!alreadySeen){
                uniquecount++;
            }
        }

        if (uniquecount % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }


    }
}
