package pe.edu.upeu.sysalmacenfx.servicio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.modelo.Categoria;
import pe.edu.upeu.sysalmacenfx.modelo.Marca;
import pe.edu.upeu.sysalmacenfx.modelo.Producto;
import pe.edu.upeu.sysalmacenfx.repositorio.CategoriaRepository;
import pe.edu.upeu.sysalmacenfx.repositorio.MarcaRepository;
import pe.edu.upeu.sysalmacenfx.repositorio.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository repo;
    //-no :CategoriaRepository repo=new CategoriaRepository()

    public Producto save(Producto to) {
        return repo.save(to);


    }

    public List<Producto> List() {
        return repo.findAll();

    }
    //U
    public Producto update(Producto to, Long id) {
        try {
            Producto toe = repo.findById(id).get();
            toe.setNombre(to.getNombre());
            if (toe!=null){
                toe.setNombre(to.getNombre());

            }
            return repo.save(toe);
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());

        }
        return null;


    }
    public Producto update(Producto to){
        return  repo.save(to);
    }
    //D
    public void delete(Long id){
        repo.deleteById(id);
    }
    public  Producto buscarId(Long id){
        return  repo.findById(id).get();
    }
}
