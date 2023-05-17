package co.com.lvicenteaa.motoservice.servicios;

import co.com.lvicenteaa.motoservice.repositorios.MotoRepository;
import co.com.lvicenteaa.motoservice.entidades.Moto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public List<Moto> getAll(){
        return this.motoRepository.findAll();
    }

    public Moto getMotoById(Long id){
        return this.motoRepository.findById(id).orElse(null);
    }

    public Moto save(Moto moto){
        Moto nuevaMoto = this.motoRepository.save(moto);
        return nuevaMoto;
    }

    public List<Moto> byUsuarioId(Long usuarioId){
        return this.motoRepository.findByUsuarioId(usuarioId);
    }

}
