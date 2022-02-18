package ed04_tarea;

/**
 * 
 * @author Josep Antoni Coll Galindo
 */
public class CCuenta {

    //atributos Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /*constructor por defecto
    */
    public CCuenta()
    {
    }
    
    /**constructor con params para iniciar clase
    *
    * @param nom Nombre cliente cuenta
    * @param cue Numero cuenta 
    * @param sal Saldo en cuenta
    * @param tipo Tipo interés
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        this.nombre =nom;
        this.cuenta=cue;
        this.saldo=sal;
        this.tipoInteres=tipo;
    }

    //métodos Getters && Setters
    /** Método getter devuelve nombre
    */
    public String getNombre(){
        return nombre;
    }
    /** Método setter asigna nombre
     * 
     * @param nom
    */
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    /** Método getter devuelve cuenta
    */
    public String getCuenta(){
        return cuenta;
    }
    /** Método setter asigna cuenta
     * 
     * @param cue
    */
    public void setCuenta(String cue){
        this.cuenta = cue;
    }
    
    /** Método getter devuelve saldo
    */
    public double getSaldo(){
        return saldo;
    }
    /** Método setter asigna saldo
     * 
     * @param sal
    */
    public void setSaldo(double sal){
        this.saldo = sal; 
    }
    
    /** Método getter devuelve tipo interés
    */
    public double getTipo(){
        return tipoInteres;
    }
    /** Método setter asigna tipo interés
     * 
     * @param tipo
    */
    public void setTipo(double tipo){
        this.tipoInteres = tipo;
    }

    /** Método para ingresar saldo. Valida datos y puede devolver Excepcion
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /** Método para retirar saldo. Valida datos y puede devolver Excepciom
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
