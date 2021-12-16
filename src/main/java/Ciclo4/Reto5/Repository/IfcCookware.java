
package Ciclo4.Reto5.Repository;

import Ciclo4.Reto5.Model.Cookware;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface IfcCookware extends MongoRepository<Cookware, String>{
    
    @Query("{'price':{'$lte':?0}}")
    public List <Cookware> findByPrice(double price);
    
    @Query("{'description':{'$regex':?0,$options:'i'}}")
    public List <Cookware> findByDescription(String description);
    
}
