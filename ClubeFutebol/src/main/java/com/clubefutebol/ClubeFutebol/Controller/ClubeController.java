package com.clubefutebol.ClubeFutebol.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.clubefutebol.ClubeFutebol.Model.Clube;
import com.clubefutebol.ClubeFutebol.repository.ClubeRepository;


@Controller
public class ClubeController {

	@Autowired
	ClubeRepository cr;

	// Tela inicial
	@GetMapping(value = "/")
	public String telaInicial(Model modelo) {
		modelo.addAttribute("clube", cr.findAll());
		return "index";
	}

	// Tela Formulário - Motrando o formulário - Get
	@GetMapping("/Tela")
	public String cadastro(Clube clube) {
		return "cadastro/cadastro";
	}

	// Enviando os dados do Formulário para o Banco
	@PostMapping("/cadastro")
	public String addClube(@Validated Clube clube, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "cadastro/cadastro";
		}
		cr.save(clube);
		return "redirect:/";
	}

	// Deletando o usuario.
	@GetMapping("/deletar/{id}")
	public String deleteClube(@PathVariable("id") Long id, Model model) {
		Clube clube = cr.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		cr.delete(clube);
		return "redirect:/";
	}

//Carregara tela de atualização
	@GetMapping("/atualizar/{id}")
	public String updateClube(@PathVariable("id") Long id, Model model) {
		Clube clube = cr.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

		model.addAttribute("clube", clube);
		return "cadastro/atualizar";
	}

//Enviando os dados atualizadoa para a tela
	@PostMapping("/atualizar/{id}")
	public String update(@PathVariable("id") long id, @Validated Clube clube, BindingResult result, Model model) {
		if (result.hasErrors()) {
			clube.setId(id);
			return "cadastro/atualizar";
		}

		cr.save(clube);
		return "redirect:/";
	}


}
