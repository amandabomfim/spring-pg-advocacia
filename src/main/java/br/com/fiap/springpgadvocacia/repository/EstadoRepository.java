package br.com.fiap.springpgadvocacia.repository;


import br.com.fiap.springpgadvocacia.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
