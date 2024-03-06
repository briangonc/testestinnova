package com.carros.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository rep;

    public Iterable<Carro> getCarros() {
        return rep.findAll();
    }

    public Optional<Carro> getCarroById(Long id) {
        return rep.findById(id);
    }

    public List<Carro> getCarrosPorMarcaEAno(String marca, Integer ano) {
        return rep.findByMarcaAndAno(marca, ano);
    }

    public List<Carro> getCarroByMarca(String marca) {
        return rep.findByMarca(marca);
    }

    public Carro insert(Carro carro) {
        return rep.save(carro);
    }

    public Carro update(Carro carro, Long id) {
        Assert.notNull(id, "Não foi possível atualizar o resgistro");

        //Busca o carro no banco de dados
        Optional<Carro> optional = getCarroById(id);
        if(optional.isPresent()) {
            Carro db = optional.get();
            //Copiar as propriedades
            db.setVeiculo(carro.getVeiculo());
            db.setMarca(carro.getMarca());
            db.setAno(carro.getAno());
            db.setDescricao(carro.getDescricao());
            db.setVendido(carro.getVendido());
            db.setCreated(carro.getCreated());
            db.setUpdated(carro.getUpdated());
            System.out.println("Carro id " + db.getId());

            //Atualiza o carro
            rep.save(db);

            return db;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }

    public void delete(Long id) {
        Optional<Carro> carro = getCarroById(id);
        if(carro.isPresent()) {
            rep.deleteById(id);
        }
    }
}
