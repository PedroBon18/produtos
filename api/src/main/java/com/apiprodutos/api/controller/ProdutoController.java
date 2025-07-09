package com.apiprodutos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.apiprodutos.api.model.ProdutoRepository;

@Controller
public class ProdutoController {
 
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/listagem")
    public String listarProdutos() {
        return "listar";
    }

    @GetMapping("/cadatro")
    public String cadastrarProdutos() {
        return "cadastar";
    }

}
