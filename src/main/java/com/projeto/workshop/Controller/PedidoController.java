package com.projeto.workshop.Controller;

import com.projeto.workshop.Entities.PedidoEntity;
import com.projeto.workshop.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;
    @GetMapping
    public ResponseEntity<List<PedidoEntity>> findAll(){
        List<PedidoEntity> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PedidoEntity> findById(@PathVariable Long id) {
        PedidoEntity obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
