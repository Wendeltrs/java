package com.clubefutebol.ClubeFutebol.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.clubefutebol.ClubeFutebol.Model.Funcionario;
import com.clubefutebol.ClubeFutebol.repository.FuncionarioRepository;

@Controller
public class FuncionarioController {

	@Autowired
	FuncionarioRepository fr;

	// Tela inicial
	@GetMapping(value = "/func")
	public String telaInicial(Model modelo) {
		modelo.addAttribute("func", fr.findAll());
		return "index3";
	}

	// Tela Formulário - Motrando o formulário - Get
	@GetMapping("/Tela3")
	public String cadastro(Funcionario funcionario) {
		return "cadastro3/cadastro3";
	}

	// Enviando os dados do Formulário para o Banco
	@PostMapping("/cadastro3")
	public String addFunc(@Validated Funcionario funcionario, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "cadastro3/cadastro3";
		}
		fr.save(funcionario);
		return "redirect:/func";
	}

	// Deletando o usuario.
	@GetMapping("/deletar3/{id}")
	public String deleteFunc(@PathVariable("id") Long id, Model model) {
		Funcionario funcionario = fr.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		fr.delete(funcionario);
		return "redirect:/func";
	}

//Carregara tela de atualização
	@GetMapping("/atualizar3/{id}")
	public String updateFunc(@PathVariable("id") Long id, Model model) {
		Funcionario funcionario = fr.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

		model.addAttribute("func", funcionario);
		return "cadastro3/atualizar3";
	}

//Enviando os dados atualizadoa para a tela
	@PostMapping("/atualizar3/{id}")
	public String update(@PathVariable("id") long id, @Validated Funcionario funcionario, BindingResult result, Model model) {
		if (result.hasErrors()) {
			funcionario.setId(id);
			return "cadastro3/atualizar3";
		}

		fr.save(funcionario);
		return "redirect:/func";
	}

}
