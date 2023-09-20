/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapresta;

/**
 *
 * @author Juan Antonio
 */
public class Solicitud {
    Material material;
    Usuario usuario;
    int idSolicitud;

    public Solicitud(Material material, Usuario usuario, int idSolicitud) {
        this.material = material;
        this.usuario = usuario;
        this.idSolicitud = idSolicitud;
    }
    
    

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
    
    
}
