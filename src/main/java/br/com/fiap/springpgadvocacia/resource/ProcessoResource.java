package br.com.fiap.springpgadvocacia.resource;

import br.com.fiap.springpgadvocacia.entity.Processo;
import br.com.fiap.springpgadvocacia.repository.ProcessoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;

@RestController
@RequestMapping(value = "/processo")

public class ProcessoResource {
    @Autowired
    private ProcessoRepository repository;

    @GetMapping
    public List<Processo> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{Id}")
    public ResponseEntity<Processo> findById(@PathVariable(name = "id") Long id) {
        Processo processo = repository.findById(id).orElse(null);
        if (processo == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(processo);
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Processo> persist(@RequestBody Processo processo) {
        Processo saved = repository.save(processo);
        return ResponseEntity.ok(saved);
    }
}
