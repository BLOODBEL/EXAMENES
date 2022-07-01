
package repository;

import enty.Lugar;
import org.springframework.data.repository.CrudRepository;
import enty.Artista;
import org.springframework.stereotype.Repository;


@Repository
public interface LugarRepository implements CrudRepository <Lugar,Long> {
    
}
