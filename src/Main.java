public class Main {
    public static void main(String[] args) {
        CajaFuerte caja = new CajaFuerte("1234");

        System.out.println("--- Primer intento ---");
        caja.abrir("1111");

        System.out.println("\n--- Segundo intento ---");
        caja.abrir("2222");

        System.out.println("\n--- Tercer intento ---");
        caja.abrir("3333");

        System.out.println("\n--- Cuarto intento ---");
        caja.abrir("1234");

        System.out.println("\n--- Estado de la caja ---");
        System.out.println("¿Está bloqueada? " + caja.isBloqueada());

        System.out.println("\n--- Intento de cambiar combinación ---");
        caja.cambiarCombinación("1234", "5678");
    }
}