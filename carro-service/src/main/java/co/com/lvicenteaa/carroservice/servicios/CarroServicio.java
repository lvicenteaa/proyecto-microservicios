package co.com.lvicenteaa.carroservice.servicios;

import co.com.lvicenteaa.carroservice.entidades.Carro;
import co.com.lvicenteaa.carroservice.repositorio.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroServicio {


    @Autowired
    private CarroRepository carroRepository;



    public List<Carro> getAll(){
        return this.carroRepository.findAll();
    }

    public Carro getCarroById(Long id){
        return this.carroRepository.findById(id).orElse(null);
    }

    public Carro save(Carro carro){
        Carro nuevoCarro = this.carroRepository.save(carro);
        return nuevoCarro;
    }

    public List<Carro> byUsuarioId(Long usuarioId){
        return this.carroRepository.findByUsuario(usuarioId);
    }

}
