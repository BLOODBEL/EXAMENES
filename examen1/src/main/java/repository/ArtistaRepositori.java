
package repository;

import enty.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ArtistaRepositori extends CrudRepository <Artista,Long>  {
    
}
