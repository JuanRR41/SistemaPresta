/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapresta;

/**
 *
 * @author Juan Antonio
 */
public class Material {
    String tipoMaterial;
    String descripcion;
    int idMaterial;

    public Material(String tipoMaterial, String descripcion, int idMaterial) {
        this.tipoMaterial = tipoMaterial;
        this.descripcion = descripcion;
        this.idMaterial = idMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }
    
    
    
}
