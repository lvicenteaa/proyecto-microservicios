package co.com.lvicenteaa.usuarioservice.servicio;

import co.com.lvicenteaa.usuarioservice.entidades.Usuario;
import co.com.lvicenteaa.usuarioservice.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

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
