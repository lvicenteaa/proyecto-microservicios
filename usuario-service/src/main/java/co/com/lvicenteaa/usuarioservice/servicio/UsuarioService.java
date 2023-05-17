package co.com.lvicenteaa.usuarioservice.servicio;

import co.com.lvicenteaa.usuarioservice.entidades.Usuario;
import co.com.lvicenteaa.usuarioservice.modelos.Carro;
import co.com.lvicenteaa.usuarioservice.modelos.Moto;
import co.com.lvicenteaa.usuarioservice.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Carro> getCarros(Long usuarioId){
        List<Carro> carros = restTemplate.getForObject("http://localhost:8082/api/carro/usuario/" + usuarioId, List.class);
        return carros;
    }

    public List<Moto> getMotos(Long usuarioId){
        List<Moto> motos = restTemplate.getForObject("http://localhost:8083/api/moto/usuario/" + usuarioId, List.class);
        return motos;
    }
    public List<Usuario> getAll(){
        return this.usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long id){
        return this.usuarioRepository.findById(id).orElse(null);
    }

    public Usuario save(Usuario usuario){
        Usuario nuevoUsuario = this.usuarioRepository.save(usuario);
        return nuevoUsuario;
    }



}
