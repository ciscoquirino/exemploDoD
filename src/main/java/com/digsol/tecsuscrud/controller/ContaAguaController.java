package com.digsol.tecsuscrud.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digsol.tecsuscrud.model.ContaAgua;
import com.digsol.tecsuscrud.service.ContaAguaService;

@RestController
@RequestMapping("/contadeagua")
public class ContaAguaController {
	
	@Autowired
	private ContaAguaService contaAguaService;
	
	//página que recebe todos os registros
	@GetMapping("/exibirtodos")
	public List<ContaAgua> list(){
		return contaAguaService.listarTodos();
	}
	
	//página pra adicionar novos dados
	@PostMapping("/novaconta")
	public String add(@RequestBody ContaAgua contaAgua) {
		contaAguaService.salvar(contaAgua);
		return "Nova conta registrada!";
	}
	
	//página que recebe os dados pelo id da conta
	@GetMapping("/{id}")
	public ResponseEntity<ContaAgua> get(@PathVariable Integer id){
		try {
			ContaAgua contaAgua=contaAguaService.buscarId(id);
			return new ResponseEntity<ContaAgua>(contaAgua, HttpStatus.OK);
			
		}
		catch(NoSuchElementException e) {
		return new ResponseEntity<ContaAgua>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ContaAgua> update(@RequestBody ContaAgua contaAgua,@PathVariable Integer id){
		try {
			ContaAgua contaExistente=contaAguaService.buscarId(id);
			contaAguaService.salvar(contaAgua);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<ContaAgua>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public String deletar(@PathVariable Integer id) {
		contaAguaService.deletar(id);
		return "Conta deletada";
	}

}
