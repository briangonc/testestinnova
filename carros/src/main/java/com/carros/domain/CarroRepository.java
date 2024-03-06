package com.carros.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CarroRepository extends CrudRepository<Carro, Long> {
    List<Carro> findByMarcaAndAno(String marca, Integer ano);

    List<Carro> findByMarca(String marca);
}
