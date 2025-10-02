import java.util.Scanner;

public class prob_677A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int HEIGHT_OF_FENCH = sc.nextInt();

        int[] arrayOFHeight = new int[n];

        int widthCount = 0;



        for (int i = 0; i < n; i++){
            arrayOFHeight[i] = sc.nextInt();
            if (arrayOFHeight[i] <= HEIGHT_OF_FENCH){
                widthCount++;
            }else {
                widthCount = widthCount + 2;
            }
        }

        //System.out.println(arrayOFHeight[0]);

        System.out.println(widthCount);
        
        
        

    }
}
