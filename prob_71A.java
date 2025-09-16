import java.util.Scanner;

public class prob_71A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        sc.nextLine();

        //declares a array to read the inputs of size inputNum
        String[] results = new String[inputNum];



        for (int i=0; i<inputNum; i++){

            String one = sc.nextLine();

            if (one.length()>10) {

                char firstChar = one.charAt(0);
                char lastChar = one.charAt(one.length() - 1);
                int stringCount = one.length()-2;
                //int lengthOfWord = one.length() - 1;

                results[i] = ""+firstChar + stringCount + lastChar;

            }else {
                results[i] = one;
            }

        }
        for (int j = 0; j<inputNum; j++){
            System.out.println(results[j]);



        }
        sc.close();






    }


}
