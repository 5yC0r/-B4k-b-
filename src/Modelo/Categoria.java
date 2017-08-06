/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Categoria {

    int codCategoria;
    String nombreNuevaCategoria;
    
    public Categoria(){
        
        this.codCategoria = 0;
        this.nombreNuevaCategoria = "";
    }
    
    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreNuevaCategoria() {
        return nombreNuevaCategoria;
    }

    public void setNombreNuevaCategoria(String nombreNuevaCategoria) {
        this.nombreNuevaCategoria = nombreNuevaCategoria;
    }
}
