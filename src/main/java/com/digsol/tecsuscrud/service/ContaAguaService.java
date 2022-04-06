package com.digsol.tecsuscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digsol.tecsuscrud.model.ContaAgua;
import com.digsol.tecsuscrud.repository.ContaAguaRepository;

@Service
public class ContaAguaService {
	
	@Autowired
	private ContaAguaRepository contaAguaRepository;
	//metodo pra puxar a lista de Contas (tipo select * ) = READ
	public List<ContaAgua> listarTodos(){
		return contaAguaRepository.findAll();
	}
	//método pra criar registro no BD = CREATE
	public void salvar(ContaAgua contaAgua) {
		contaAguaRepository.save(contaAgua);
	}
	//método pra buscar por Id
	public ContaAgua buscarId(Integer id) {
		return contaAguaRepository.findById(id).get();
	}
	//método pra deletar registro pelo Id = DELETE
	public void deletar(Integer id) {
		contaAguaRepository.deleteById(id);
	}

}
