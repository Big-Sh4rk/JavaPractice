
import java.util.Scanner;

/*
Teniendo dos matrices de n x n, siendo n, un número comprendido entre 3 y 5, cuyo
contenido sean valores enteros distintos de cero, contenidos en el intervalo [-9,+9] y
ambas de idénticas dimensiones, se deberá hacer lo siguiente:
1) En la primera matriz, se revisará por filas, y cuando se encuentre un valor
negativo, se cambiará el signo del valor, y se copiará el nuevo valor en la misma
posición, pero en la segunda matriz.
2) Los valores restantes de la primera matriz, deberán ser elevados al cuadrado, y
luego, esos resultados copiados también en la segunda matriz, en la misma
posición en que se encontraba el dato original en la primera matriz.
3) Tanto la conversión de negativo a positivo, como la elevación al cuadrado,
deberá hacerlo una sola función, distinguiendo en cada caso particular, la
operación aritmética a realizar y devolviendo el valor entero correspondiente.
4) La muestra de las matrices debe realizarse a través de un procedimiento.
5) Al finalizar, se deberán mostrar ambas matrices en forma rectangular, para
controlar los resultados.
6) En un nuevo archivo dentro del mismo proyecto, declare las variables
dimensionadas como estáticas y realice los cambios necesarios para tal
optimización.
 */
/**
 *
 * @author Matias Guevara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = dimension();
        int[][] matriz = asignarValores(n);
        
    }

    private static int dimension() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la dimension de su matiz cuadrada: \n");
        int dim = input.nextInt();
        if(dim >=3 && dim <= 5){
            return dim;
        }
        return dimension();
    }

    private static int[][] asignarValores(int n) {
        int[][] matriz = new int[n][n];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){  
                int num = validarNum(i, j);
                matriz[i][j] = num;
            }
        }
        checkDeValores(matriz);
        return matriz;
    }

    private static int validarNum(int i, int j) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero para la posicion :" + i + " " + j);
        int num = input.nextInt();
        if(num >= -9 && num <= 9){
            return num;
        }
        return validarNum(i, j);
    }

    private static void checkDeValores(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j] < 0){
                    matriz[i][j] *= (-1);
                }
            }
        }
    }
    
    
}
