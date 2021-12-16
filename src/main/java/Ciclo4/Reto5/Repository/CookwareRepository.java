
package Ciclo4.Reto5.Repository;

import Ciclo4.Reto5.Model.Cookware;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CookwareRepository {
    
    @Autowired
    private IfcCookware ProductoCRUD; 
    
    public List<Cookware> MostrarProductos(){
        return ProductoCRUD.findAll();
    }
    
    public Optional<Cookware> BuscarProducto(String id){
        return ProductoCRUD.findById(id);
    }
   
    public Cookware GuardarProducto(Cookware P){
        return ProductoCRUD.save(P);
    } 
    
    public void EliminarProducto(String id){
        ProductoCRUD.deleteById(id);
    }
    
    public List<Cookware> FiltrarProductosPrecio(double price){
        return ProductoCRUD.findByPrice(price);
    }
    
    public List<Cookware> FiltrarProductosDesc(String description){
        return ProductoCRUD.findByDescription(description);
    }
}
