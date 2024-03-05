package br.com.fiap.springpgadvocacia.resource;
import br.com.fiap.springpgadvocacia.entity.TipoDeAcao;
import br.com.fiap.springpgadvocacia.repository.TipoDeAcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tipo-de-acao")
public class TipoDeAcaoResource {

    @Autowired
    private TipoDeAcaoRepository repository;

    @GetMapping
    public List<TipoDeAcao> findAll() {
        return repository.findAll();
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<TipoDeAcao> findById(@PathVariable(name="id") Long id) {
        TipoDeAcao tipoDeAcao = repository.findById(id).orElse(null);
        if(tipoDeAcao == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(tipoDeAcao);
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<TipoDeAcao> persist(@RequestBody TipoDeAcao tipoDeAcao) {
        TipoDeAcao saved = repository.save(tipoDeAcao);
        return ResponseEntity.ok(saved);
    }

}
