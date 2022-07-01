
package controller;
import enty.Lugar;
import enty.Artista;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import service.ArtistaService;
import service.IArtistaService;
import service.ILugarService;


@Controller
public class ArtistaController {
 
    @Autowired
    private IArtistaService lrtistaService;
    @Autowired
    private ILugarService lugarService;
    
        @GetMapping("/artista")
    public String index(Model model) {
        List<Artista> listaartista = ArtistaService.getAllartista();
        model.addAttribute("titulo", "Tabla persona");
        model.addAttribute("artista", listaartista);
        return "artista";

    }

    @GetMapping("/artistaN")
    public String crearArtista(Model model) {
        List<Lugar> listaLugar = lugarService.listCountry();
        model.addAttribute("artista", new Artista());
        model.addAttribute("Lugar", listaLugar);
        return "crear";

    }

    @PostMapping("/save")
    public String guardarArtista(@ModelAttribute Artista artista) {
        ArtistaService.saveArtista(artista);
        return "redirect:/artista";
    }

    @GetMapping("/editArtista/{id}")
    public String editarArtista(@PathVariable("id") Long idArtista, Model model) {
        Artista artista = ArtistaService.getArtistaById(idArtista);
        List<Lugar> listaLugar = lugarService.listCountry();
        model.addAttribute("artista", artista);
        model.addAttribute("lugar", listaLugar);
        return "crear";
    }
    
     @GetMapping("/delate/{id}")
    public String eliminarArtista(@PathVariable("id") Long idArtista, Model model) {
        ArtistaService.delate(idArtista);
        return "redirect:/artista";
        
    }

}

    

