/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacsoftware;

/**
 *
 * @author davidgaona
 */
public class Data {
    private String Producto;
    private String SubCategoria;
    private String Categoria;
    private float Cantidad;
    
    public void setData(String d1, String d2, String d3, float d4)
    {
        Producto = d1;
        SubCategoria = d2;
        Categoria = d3;
        Cantidad = d4;
    }
    
    public String getProducto()
    {
        return Producto;
    }
    
    public String getSubCategoria()
    {
        return SubCategoria;
    }
    
    public String getCategoria()
    {
        return Categoria;
    }
    
    public float getCantidad()
    {
        return Cantidad;
    }
    
    public boolean namePro(String Pr)
    {
        if( Pr.isEmpty() ||Pr.length() > Producto.length() )
            return false;
        for( int a = 0; a < Pr.length() ; a++ )
            if( Pr.charAt(a) != Producto.charAt(a) )
                return false;
        return true;
    }
    
    public boolean nameCat(String cat)
    {
        if( cat.isEmpty() || cat.length() > Categoria.length() )
            return false;
        for(int a = 0; a < cat.length(); a++)
            if( cat.charAt(a) != Categoria.charAt(a) )
                return false;
        return true;
    }
    
    public boolean nameSCat(String cat)
    {
        if( cat.isEmpty() || cat.length() > SubCategoria.length() )
            return false;
        for( int a = 0 ; a < cat.length(); a++)
            if( cat.charAt(a) != SubCategoria.charAt(a) )
                return false;
        return true;
    }
}
