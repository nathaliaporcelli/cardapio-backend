package com.projetosti.cardapio.controller;

import com.projetosti.cardapio.burgers.Burgers;
import com.projetosti.cardapio.burgers.BurgersRepository;
import com.projetosti.cardapio.burgers.BurgersRequestDTO;
import com.projetosti.cardapio.burgers.BurgersResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/burgers")
public class BurgersController {

    @Autowired
    private BurgersRepository repository;

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @GetMapping
    public List<BurgersResponseDTO> getAll(){
        List<BurgersResponseDTO> burgersList = repository.findAll().stream().map(BurgersResponseDTO::new).toList();
        return burgersList;



    }

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody BurgersRequestDTO data){
        Burgers burgersData = new Burgers(data);
        repository.save(burgersData);
        return;

    }

}
