package com.itb.inf2dm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos() {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 12 Litros");
		p1.setCodigoBarras("DWA89E7Q89WYHDAWI");
		p1.setPreco(3654.12);
				
		listaDeProdutos.add(p1);
		
		model.addAttribute("listadeprodutos", listaDeProdutos);
		return "produtos";
				
	}
	
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-prod";
	}
}
