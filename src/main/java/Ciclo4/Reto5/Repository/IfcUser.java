
package Ciclo4.Reto5.Repository;

import Ciclo4.Reto5.Model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IfcUser extends MongoRepository<User, Integer>{
    
    public Optional <User> findByEmail(String email);
    public Optional <User> findByPassword(String password);
    
    //Seleccionar usuario con el maximo id
    public Optional <User> findTopByOrderByIdDesc();
    
    @Query("{monthBirthtDay:?0}")
    public List <User> findByMonthBirthtDay(String MonthBirthtDay);
}
