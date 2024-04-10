/**
 * Clase que representa la cesta y los distintos metodos
 * para fijar comercio, indicar el usuario, consultar bonificacion
 * actulizar el bono, comprar, y los constructores.
 * @author Ittai Alcahut
 * 
 */
package Entornos4;

public class eCesta {

    /*Propiedades de la Clase eCesta*/
    private String comercio;
    private double bono;
    private String usuario;
  
    /* Constructor sin argumentos */
    public eCesta (){
    }
    /**
     * Es el constructor principal de la clase
     * @param c representa el comercio
     * @param b representa la bonificacion inicial al crear el usuario
     * @param u representa al usuario
     */
    /*Constructor con parámetros*/
    public eCesta (String c, double b, String u)
    {
        comercio=c;
        double extra = 10;
        bono=b+extra;
        usuario=u;
    }        


    public String getComercio() {
        return this.comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public double getBono() {
        return this.bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Metodo que fija el comercio 
     * @param nombre variable del tipo string que da valor a la variable comercio
     */
   /*Método para fijar el comercio*/
    public void AsignarComercio(String nombre){
        comercio=nombre;
    }
    /**
     * Metodo que indica el usuario de la cesta
     * @return usuario de la cesta
     */
    /* Método que indica el usuario de la cesta electrónica */
    public String Titular(){
        return usuario;
    } 
    /**
     * Metodo de consulta de bonificacion
     * @return bono que corresponde al valor dando en el constructor de mas arriba
     */
    /*Método de consulta de bonificación*/
     public double bonificacion (){
        return bono;
    } 
    /**
     * Metodo que actualiza el bono
     * @param n aumenta el valor del bono segun el double que el usuario ponga
     * @throws Exception en caso de que n sea menor a 0 nos dara error 
     */
    /* Método para actualizar el bono */
    public void ActualizarBono (double n) throws Exception{
        if (n<0)
            throw new Exception("No es posible actualizar bono");
        bono= bono+ n;
    } 
    /**
     * Metodo para comprar
     * @param total valor dado que muestra el total de la cesta
     * @throws Exception en caso de que total sea menor o igual a 0, o que bonificacion sea menor a total
     */
    /* Método para comprar */
    public void comprar (double total) throws Exception{
        if (total<= 0)
            throw new Exception ("Imposible la compra");
        if (bonificacion()< total)
            throw new Exception ("Su bono es insuficiente para la compra");
        bono = bono-total;
    } 
    /**
     * Metodo que devuelve el usuario de la cesta
     * @return usuario que es el propietario de la cesta
     */
    /*Método que me devuelve el usuario de la cesta*/
    public String identificacionUsuario (){
        return usuario;
    }
}