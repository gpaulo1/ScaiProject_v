/**
 * 
 */
package net.com.scaiprojectv.controller;

import java.util.List;

import net.com.scaiprojectv.model.Pessoa;
import net.com.scaiprojectv.predicate.PessoaPredicate;
import net.com.scaiprojectv.service.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Comment(s): 
 * 
 * @author Paulo Garcia
 * @Feb 19, 2014
 * @7:19:36 PM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
@Controller
public class AlunoController {

	private static final String RETURN_INDEX = "cadastrar-aluno";
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	public ModelAndView view(){
		ModelAndView view = new ModelAndView(RETURN_INDEX);
		Pessoa aluno = new Pessoa();
		aluno.setNome("Livia");
		aluno.setSobreNome("Garcia");
		pessoaService.criar(aluno);
		view.addObject("status", "Aluno " + aluno.getNome() + " cadastrado com sucesso!");
		return view;
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contact(){
		ModelAndView view = new ModelAndView("Contact");
		Pessoa aluno = new Pessoa();
		aluno.setNome("Livia");
		aluno.setSobreNome("Garcia");
		pessoaService.criar(aluno);
		List<Pessoa> teste = (List<Pessoa>) pessoaService.buscarTodos(PessoaPredicate.buscarPorNome("Livia"));
		System.out.println("Testtttttttttt: " + teste.get(0).getNome());
		view.addObject("status", "Aluno " + aluno.getNome() + " cadastrado com sucesso!");
		return view;
	}
	
}
