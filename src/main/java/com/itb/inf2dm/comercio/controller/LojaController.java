package com.itb.inf2dm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model mordel) {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 12 Litros");
		p1.setCodigoBarras("DWA89E7Q89WYHDAWI");
		p1.setPreco(3654.12);
		p1.setDescricao(null);
		p1.setCodStatus(true);
		
		Produto p2 = new Produto();
		p2.setId(20l);
		p2.setNome("Celular");
		p2.setCodigoBarras("DSAHDUAJSAUIDSJNDSJA");
		p2.setPreco(1890.99);
		p2.setDescricao(null);
		p2.setCodStatus(true);
		
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos";
				
	}
	
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-prod";
	}
}
