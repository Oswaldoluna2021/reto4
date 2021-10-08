package reto_4;

import javax.swing.JOptionPane;

public class MenuCuenta1 extends MenuCuenta{

    public String tipoDocumento;
    public int documento;
    public String nombre;
    public String apellidos;
    public String direccion;
    public int telefono;
    public int cuenta;
    public String tipoCuenta;
    public int saldo;
    public int cantidad;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public MenuCuenta1() {
    }

    public MenuCuenta1(String tipoDocumento, int documento, String nombre, String apellidos, int cuenta, String tipoCuenta, int saldo, int cantidad) {
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuenta = cuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.cantidad = cantidad;
    }

    

    public void CrearCuenta(String tipoDocumento, int documento, String nombre, String apellidos, int cuenta, String tipoCuenta, int saldo){
        
        
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuenta = cuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
                
    }
    
   
    
   public String toString() {
        return "Persona{"
                + "\n, documento=" + documento
                + "\n, tipoDocumento=" + tipoDocumento
                + "\n, nombre=" + nombre 
                + "\n, apellidos=" + apellidos 
                + "\n, cuenta=" + cuenta 
                + "\n, tipoCuenta=" + tipoCuenta 
                + "\n, saldo=" + saldo + " }";
                

    }
}
