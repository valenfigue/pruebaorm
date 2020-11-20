/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucab.dsw.entidades;

import javax.persistence.*;


/**
 *
 * @author Omar David
 */

@Entity
@Table ( name = "subcategoria")
public class Subcategoria extends EntidadBase{

    @Column( name = "descripcion", nullable = false )
    private String _descripcion;

    public String get_descripcion()
    {
        return _descripcion;
    }

    public void set_descripcion( String _descripcion ) { this._descripcion = _descripcion; }

    @ManyToOne
    @JoinColumn (name = "idCategoria" )
    private Categoria _Categoria;

    public Categoria get_Categoria()
    {
        return _Categoria;
    }

    public void set_Categoria( Categoria _Categoria )
    {
        this._Categoria = _Categoria;
    }


    public Subcategoria ( long id )
    {
        super( id );
    }

    public Subcategoria ( )
    {

    }
    
}
