public class Main {
    public static void main(String[] args) {
        
        String[] zonas = {"Sector Secos", "Sector Refrigerados", "Sector Alta Rotacion"};

        // Matriz de productividad: 3 zonas (filas) x 5 operarios (columnas)
        int[][] palletsEscalonados = {
            {45, 50, 12, 48, 55},   
            {30, 32, 35, 29, 31},   
            {100, 95, 105, 90, 110} 
        };

        System.out.println("--- MODULO DE AUDITORIA LOGISTICA ---");
        
        int filaBuscada = 0; // Sector Secos
        int operarioLento = LogicaDeposito.cuelloBotella(palletsEscalonados, filaBuscada);
        System.out.println("El operario que esta haciendo lento su trabajo es el ID: " + operarioLento);

        int[] totalPallets = LogicaDeposito.acumulador(palletsEscalonados);
        
        System.out.println("\n--- TOTAL DE PALLETS POR SECTOR ---");
        for (int i = 0; i < zonas.length; i++) {
            System.out.println(zonas[i] + " : " + totalPallets[i] + " pallets");
        }

        int[] mermas = new int[3];
        
        System.out.println("\n--- REGISTRO DE MERMAS (CAJAS ROTAS) ---");
        LogicaDeposito.registroValidacion(mermas, zonas);
        
        System.out.println("\nAuditoria finalizada y guardada en el sistema con exito.");
    }
}