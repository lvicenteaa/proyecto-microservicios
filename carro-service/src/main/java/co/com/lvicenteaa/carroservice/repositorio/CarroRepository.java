package co.com.lvicenteaa.carroservice.repositorio;

import co.com.lvicenteaa.carroservice.entidades.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    List<Carro> findByUsuario(Long usuarioId);

}
