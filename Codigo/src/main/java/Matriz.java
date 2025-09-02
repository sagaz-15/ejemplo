import java.util.Random;
import java.util.Scanner;
public class Matriz {

    public int[][] leerMatriz(int n, int m) {
        Random random = new Random();
        int[][] numeros = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numeros[i][j] = random.nextInt(90) + 10;
                System.out.println(numeros[i][j]+"  ");
            }
        }
        return numeros;
    }

    public double CalcularPromedio(int[][] numeros, int n, int m) {
        double acum=0, prom;
        int cont=0;
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros.length;j++){
                if((j+i)%2==0){
                    acum+=numeros[i][j];
                    cont++;
                }
            }
        }
        prom=acum/cont;
        return prom;
    }
}
