package com.carros.api;



import com.carros.domain.Carro;
import com.carros.domain.CarroService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
    @Autowired
    private CarroService service;

    @GetMapping()
    public ResponseEntity<Iterable<Carro>> get() {
        return ResponseEntity.ok(service.getCarros());
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        Optional<Carro> carro = service.getCarroById(id);

            return carro.isPresent() ?
                    ResponseEntity.ok(carro.get()) :
                    ResponseEntity.notFound().build();
    }

    @GetMapping("/marca/{marca}")
    public ResponseEntity getCarrosByMarca(@PathVariable("marca") String marca) {
        List<Carro> carros = service.getCarroByMarca(marca);

        return carros.isEmpty() ?
                 ResponseEntity.noContent().build() :
                 ResponseEntity.ok(carros);
    }

    @GetMapping("/{marca}/{ano}")
    public List<Carro> getCarrosPorMarcaEAno(
            @PathVariable("marca") String marca,
            @PathVariable("ano") Integer ano) {
        return service.getCarrosPorMarcaEAno(marca, ano);
    }

    @PostMapping
    public String post(@RequestBody Carro carro) {
        Carro c = service.insert(carro);
        return "Carro salco com sucesso: " + c.getId();
    }

    @PutMapping("/{id}")
    public String put (@PathVariable("id") Long id, @RequestBody Carro carro) {
        Carro c = service.update(carro, id);
        return "Carro atualizado com sucesso: " + c.getId();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {

        service.delete(id);

        return "Carro deletado com sucesso";
    }
}
