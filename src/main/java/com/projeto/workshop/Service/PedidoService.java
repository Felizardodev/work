package com.projeto.workshop.Service;

import com.projeto.workshop.Entities.PedidoEntity;
import com.projeto.workshop.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public List<PedidoEntity> findAll() {
        return repository.findAll();
    }

    public PedidoEntity findById(Long id) {
        Optional<PedidoEntity> obj = repository.findById(id);
        return obj.get();
    }
}

