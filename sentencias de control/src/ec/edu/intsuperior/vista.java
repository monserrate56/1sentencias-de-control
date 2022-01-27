/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior;

/**
 *
 * @author USUARIO
 */
public class vista {
    private String codigoPais;
    private String nombrePais;
        

   public vista() {
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
