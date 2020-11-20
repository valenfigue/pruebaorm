package ucab.dsw.entidades;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "subcategoria", schema = "mydb")
public class SubcategoriaEnt extends EntidadBase{
    private List<SolicitudEnt> solicitudes;

    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "estatus")
    private String _estatus;

    @Override
    public String get_estatus() {
        return _estatus;
    }

    @Override
    public void set_estatus(String _estatus) {
        this._estatus = _estatus;
    }

    @OneToMany(mappedBy = "subcategoria")
    public List<SolicitudEnt> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudEnt> solicitudes) {
        this.solicitudes = solicitudes;
    }
    public SubcategoriaEnt( long id )
    {
        super( id );
    }

    public SubcategoriaEnt( )
    {

    }
}
