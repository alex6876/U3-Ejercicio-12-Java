public class CajaFuerte {
    private String combinación;
    private boolean bloqueada;
    private int intentosFallido;

    public CajaFuerte(String combinación) {
        this.combinación = combinación;
        this.bloqueada = false;
        this.intentosFallido = 0;
    }

    public boolean abrir(String intentoClave){

        if (bloqueada){
            System.out.println("Caja fuerte bloqueada.");
            return false;
        }

        if(combinación.equals(intentoClave)){

            intentosFallido = 0;
            System.out.println("La caja fue abierta.");
            return true;

        }else{
            intentosFallido++;
            System.out.println("Combinación incorrecta");
            if(intentosFallido >= 3){
                bloqueada = true;
                System.out.println("La caja fue bloqueda por seguridad.");
            }
        }
        return false;
    }

    public void cambiarCombinación(String claveActual , String nuevaClave){
        if(bloqueada){
            System.out.println("Caja fuerte bloqueada, no se puede cambiar la clave.");
        } else if (!combinación.equals(claveActual)) {
            System.out.println("Clave incorrecta.");
        }else if (combinación == null || combinación.isEmpty()){
            System.out.println("La clave no puede estar vacia.");
        }else{
            combinación = nuevaClave;
            intentosFallido = 0;
            System.out.println("Combinación cambiada correctamente.");
        }
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

}
