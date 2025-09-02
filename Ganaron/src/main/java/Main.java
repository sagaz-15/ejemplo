import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ganaron game = new Ganaron();

        int n;

        System.out.print("cual es el orden de la matriz?: ");
        n=sc.nextInt();

        float[][] notas= new float[n][n];
        notas=game.leermatriz(n);

    }
}
