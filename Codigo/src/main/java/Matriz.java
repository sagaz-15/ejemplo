import java.util.Random;
import java.util.Scanner;
public class Matriz {

    public int[][] leerMatriz(int n, int m) {
        Ramdom ramdom = new Random();
        int[][] numeros = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numeros[i][j] = ramdom.nextInt(10,100);
                System.out.println(numeros[i][j]+"  ");
            }
        }
    }
}
