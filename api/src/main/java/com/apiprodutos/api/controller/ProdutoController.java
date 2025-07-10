package com.apiprodutos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.apiprodutos.api.model.Produto;
import com.apiprodutos.api.model.ProdutoRepository;



@Controller
public class ProdutoController {
 
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/")
    public String listarProdutos(Model model) {
        model.addAttribute("todosOsProdutos", repository.findAll());
        return "listar";
    }

    @GetMapping("/cadatro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastar";
    }
    
    @PostMapping("/cadatro")
    public String cadastrarProdutos(Produto produto) {
        repository.save(produto);
        return "cadastar";
    }

}
