
package service;

import repository.ArtistaRepositori;
import enty.Artista;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



public class ArtistaService implements IArtistaRepositori {
     @Autowired
    private ArtistaRepository ArtistaRepository; 
   
    @Override
    public Persona getArtistaById(long Capacidad) {
        return ArtistaRepository.findById(Capacidad).orElse(null); }  
  
    @Override
    public void savaArtista(Artista artista) {
        ArtistaRepository.save(artista); 
    }

    @Override
    public void delate(long Capacidad) {
            ArtistaRepository.deleteById(Capacidad);
    }

    @Override
    public List<Artista> getAllArtista() {
        return (List<Artista>)ArtistaRepositori.findAll();
    }

   
    
    
   
   
            }



