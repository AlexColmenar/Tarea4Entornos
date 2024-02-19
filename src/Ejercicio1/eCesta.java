package Ejercicio1;

public class eCesta {

    /**
     * @return the comercio
     */
    public String getComercio() {
        return comercio;
    }

    /**
     * @param comercio the comercio to set
     */
    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    /**
     * @return the bono
     */
    public double getBono() {
        return bono;
    }

    /**
     * @param bono the bono to set
     */
    public void setBono(double bono) {
        this.bono = bono;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the extra
     */
    public double getExtra() {
        return extra;
    }

    /**
     * @param extra the extra to set
     */
    public void setExtra(double extra) {
        this.extra = extra;
    }

    /*Propiedades de la Clase eCesta*/
    private String comercio;

    private double bono;

    private String usuario;

    private double extra;

    /* Constructor sin argumentos */
    public eCesta() {

    }

    /*Constructor con parámetros*/
    public eCesta(String c, double b, String u, double d) {

        comercio = c;

        bono = b + 10;

        usuario = u;

        extra = d + 10;

    }

    /*Método para fijar el comercio*/
    public void AsignarComercio(String nombre) {

        setComercio(nombre);

    }

    /* Método que indica el usuario de la cesta electrónica */
    public String Titular() {

        return getUsuario();

    }

    /*Método de consulta de bonificación*/
    public double bonificacion() {

        return getBono();

    }

    /* Método para actualizar el bono */
    public void ActualizarBono(double n) throws Exception {

        if (n < 0) {
            throw new Exception("No es posible actualizar bono");
        }

        setBono(getBono() + n);

    }

    /* Método para comprar */
    public void comprar(double total) throws Exception {

        if (total <= 0) {
            throw new Exception("Imposible la compra");
        }

        if (bonificacion() < total) {
            throw new Exception("Su bono es insuficiente para la compra");
        }

        setBono(getBono() - total);

    }

    /*Método que me devuelve el usuario de la cesta*/
    public String identificacionUsuario() {

        return getUsuario();

    }

    public void NuevoMetodo() throws Exception {
        comprar(50);
        ActualizarBono(100);
        System.out.println(bonificacion());
    }

    public double getter() {
        return extra;
    }

}
