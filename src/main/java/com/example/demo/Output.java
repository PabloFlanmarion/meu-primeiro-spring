package com.example.demo;

import java.time.LocalDateTime;

public class Output {

	private LocalDateTime responseDateTime = LocalDateTime.now();
	private String resposta;

	
	public LocalDateTime getResponseDateTime() {
		return responseDateTime;
	}

	public void setResponseDateTime(LocalDateTime responseDateTime) {
		this.responseDateTime = responseDateTime;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
