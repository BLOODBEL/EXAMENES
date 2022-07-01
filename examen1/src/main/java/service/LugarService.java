package service;



import enty.Lugar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LugarRepository;


@Service
public class LugarService implements ILugarService{

    @Autowired
    private LugarRepository PaisRepository;

    @Override
    public List<Lugar> listCountry() {
          return (List<Lugar>)PaisRepository.findAll(); 
          
    }
 
 

}
