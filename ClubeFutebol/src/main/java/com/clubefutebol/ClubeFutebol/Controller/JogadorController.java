package com.clubefutebol.ClubeFutebol.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.clubefutebol.ClubeFutebol.Model.Jogador;
import com.clubefutebol.ClubeFutebol.repository.JogadorRepository;

@Controller
public class JogadorController {
	
	@Autowired
	JogadorRepository jr;
	
	@GetMapping(value = "/jogador")
	public String telaInicial(Model model) {
		model.addAttribute("jogador", jr.findAll());
		return "index2";
	}
	
	
	@GetMapping("/Tela2")
	public String cadastro2(Jogador jogador) {
		return "cadastro2/cadastro2";
	}
	
	
	@PostMapping("/cadastro2")
	public String addJogador(@Validated Jogador jogador, BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "cadastro2/cadastro2";
		}
		jr.save(jogador);
		return "redirect:/jogador";
	}
	
	
	@GetMapping("/deletar2/{id}")
	public String deleteJogador(@PathVariable("id") Long id, Model model) {
		Jogador jogador = jr.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		jr.delete(jogador);
		return "redirect:/jogador";		
	}
	
	
	@GetMapping("/atualizar2/{id}")
	public String updateJogador(@PathVariable("id") Long id,Model model) {
		Jogador jogador = jr.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		model.addAttribute("jogador", jogador);
		return "cadastro2/atualizar2";
	}
	
	
	@PostMapping("/atualizar2/{id}")
	public String update(@PathVariable("id") long id, @Validated Jogador jogador, BindingResult result, Model model) {
		if (result.hasErrors()) {
			jogador.setId(id);
			return "cadastro2/atualizar2";
		}

		jr.save(jogador);
		return "redirect:/jogador";
	}
	
}