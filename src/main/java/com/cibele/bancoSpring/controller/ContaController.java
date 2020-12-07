package com.cibele.bancoSpring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibele.bancoSpring.dto.ContaDTO;

@RestController()
@RequestMapping("conta")
public class ContaController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ContaController.class);


	@GetMapping()
	public List<ContaDTO> listaConta() {
		return null;

	}

	@GetMapping("/{numero}")
	public ContaDTO buscaConta(@PathVariable String numero) {
		return new ContaDTO();

	}

	@PostMapping
	public ContaDTO criaConta(@RequestBody ContaDTO conta) {
		
		log.info(conta.toString());
		return null;

	}

	@PutMapping
	public ContaDTO editaConta(@RequestBody ContaDTO conta) {
		return null;

	}

	 
	@DeleteMapping("/{numero}")
	public Boolean deletaConta(@PathVariable Long numero) {
		return null;
		
	}
}
