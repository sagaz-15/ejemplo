import java.util.Random;

public class Ganaron {

    public float[][] leermatriz(int n){
        Random aleatorio = new Random();
        float[][] notas = new float[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                notas[i][j]=(float)aleatorio.nextInt(0,51)/100;
                System.out.println(notas[i][j]+ "");
            }
        }
        return notas;
    }

    //crear un vector con las notas mayores o iguales a 3
    public int[] crearVector(float[][] notas, int n){
        int cont=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (notas[i][j] >= 3.0){
                    cont++;
                }
            }
        }

        int[] vector = new int[cont];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (notas[i][j] >= 3.0) {
                    vector[idx++] = (int) notas[i][j]; // guarda la nota truncada
                }
            }
        }
        return vector;
    }
}
