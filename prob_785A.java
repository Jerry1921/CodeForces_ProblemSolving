import java.util.Scanner;

public class prob_785A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int numOfFaces = 0;

        for (int i = 0; i < n; i++){
            String stringInput = sc.next();
            if (stringInput.equals("Tetrahedron")){
                numOfFaces += 4;
            } else if (stringInput.equals("Cube")) {
                numOfFaces += 6;
            } else if (stringInput.equals("Octahedron")) {
                numOfFaces += 8;
            }else if (stringInput.equals("Dodecahedron")) {
                numOfFaces += 12;
            }else if (stringInput.equals("Icosahedron")) {
                numOfFaces += 20;
            }
        }
        System.out.println(numOfFaces);
    }
}
