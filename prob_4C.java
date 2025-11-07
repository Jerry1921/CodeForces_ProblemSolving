import java.util.*;

public class prob_4C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //ArrayList<String> myListOfString = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            String myString = sc.next();

            //myListOfString.add(myString);
            if (map.containsKey(myString)){
                int count = map.get(myString);
                System.out.println(myString + count);
                map.put(myString, count + 1);

            }else {
                System.out.println("OK");
                map.put(myString, 1);
            }
        }
    }
}
