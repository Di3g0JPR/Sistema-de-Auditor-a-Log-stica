import java.util.Scanner;

public class LogicaDeposito {

    public static int cuelloBotella(int[][] matriz, int fila) {
        int minimoPallets = matriz[fila][0];
        int operario = 0;

        for (int i = 0; i < matriz[fila].length; i++) {
            if (matriz[fila][i] < minimoPallets) {
                minimoPallets = matriz[fila][i];
                operario = i;
            }
        }
        
        return operario;
    }

    public static int[] acumulador(int[][] matriz) {
        int filas = matriz.length;
        int[] vectorAcumulador = new int[filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vectorAcumulador[i] = vectorAcumulador[i] + matriz[i][j];
            }
        }
        
        return vectorAcumulador;
    }

    public static void registroValidacion(int[] arrayMermas, String[] nombresZonas) {
        Scanner sc = new Scanner(System.in);
        int palletsDaniados = 0;

        for (int i = 0; i < arrayMermas.length; i++) {
            System.out.println("Ingrese la cantidad de pallets dañados para " + nombresZonas[i] + ":");
            palletsDaniados = sc.nextInt();
            
            while (palletsDaniados < 0) {
                System.out.println("Error: Por favor ingrese un numero mayor o igual a 0.");
                palletsDaniados = sc.nextInt();
            }
            
            arrayMermas[i] = palletsDaniados;
        }
        
        sc.close(); // Buena práctica: cerrar el Scanner al final de su uso
    }
}