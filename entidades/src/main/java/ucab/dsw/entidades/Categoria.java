package ucab.dsw.entidades;


import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table( name = "categoria" )
public class Categoria extends EntidadBase{

    @Column( name = "descripcion" )
    private String _descripcion;

    @Column( name = "estatus" )
    private String _estatus;

    /*@OneToMany( mappedBy = "_categoria", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    private List<SubCategoria> _categorias;*/


    public Categoria( long id )
    {
        super( id );
    }

    public Categoria()
    {

    }

    public String get_descripcion()
    {
        return _descripcion;
    }

    public void set_descripcion( String _descripcion )
    {
        this._descripcion = _descripcion;
    }

    @Override
    public String get_estatus()
    {
        return _estatus;
    }

    @Override
    public void set_estatus( String _estatus )
    {
        this._estatus = _estatus;
    }

    /*public List<SubCategoria> get_categorias()
    {
        return _categorias;
    }

    public void get_categorias( List<Usuario> _usuarios )
    {
        this._categorias = _categorias;
    }*/

}
