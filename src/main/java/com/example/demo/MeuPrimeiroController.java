package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuPrimeiroController {

	@PostMapping("/teste")
	public ResponseEntity<Output> teste(@RequestBody Input input) {
		System.out.println("Olá, sou a primeira API sua.");
		System.out.println("Nome da Pessoa: " + input.getNome());
		System.out.println("Pergunta da Pessoa: " + input.getPergunta());
		Output output = new Output();
		String resposta = "Olá " + input.getNome() + " \\r\\n";
		resposta += "Sua resposta é ....";
		resposta += "Hoje é " + LocalDate.now();
		output.setResponseDateTime(LocalDateTime.now());
		output.setResposta(resposta);
		return ResponseEntity.ok(output);
	}
}
