/**
 * 
 */
package net.com.scaiprojectv.service.impl;

import java.util.List;

import net.com.scaiprojectv.model.Pessoa;
import net.com.scaiprojectv.repository.PessoaRepository;
import net.com.scaiprojectv.service.PessoaService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Comment(s): Essa implementação da interface de {@link PessoaService} comunica
 * com a base de dados utilizando o Spring JPA Repository.
 * 
 * @author Paulo Garcia
 * @Feb 19, 2014
 * @5:28:59 PM
 * 
 * Scai Project_V®
 * 
 * Developed by Paulo Garcia
 */
@Service
public class PessoaServiceImpl implements PessoaService {

	@Resource
	private PessoaRepository repository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.com.scaiprojectv.service.AlunoService#criar(net.com.scaiprojectv.
	 * model.Aluno)
	 */
	@Transactional
	public Pessoa criar(Pessoa aluno) {
		return repository.save(aluno);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.com.scaiprojectv.service.AlunoService#remover(java.lang.Long)
	 */
	@Transactional(rollbackFor = Exception.class)
	public Pessoa remover(Long id) {
		Pessoa deletado = buscarPorId(id);
		repository.delete(id);
		
		return deletado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.com.scaiprojectv.service.AlunoService#buscarTodos()
	 */
	public List<Pessoa> buscarTodos() {
		return repository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.com.scaiprojectv.service.AlunoService#buscarPorId()
	 */
	public Pessoa buscarPorId(Long id) {
		return repository.findOne(id);
	}

}
