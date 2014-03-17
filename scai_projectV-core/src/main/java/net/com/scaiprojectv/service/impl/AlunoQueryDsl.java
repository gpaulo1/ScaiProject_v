/**
 * 
 */
package net.com.scaiprojectv.service.impl;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.com.scaiprojectv.model.Pessoa;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaMetamodelEntityInformation;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Comment(s): 
 * 
 * @author Paulo Garcia
 * @Feb 19, 2014
 * @6:44:31 PM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
@Repository
public class AlunoQueryDsl {

	private QueryDslJpaRepository<Pessoa, Long> repository;

	@PersistenceContext
	private EntityManager entidade;

	/**
	 * Método para Inicializar o JpaRepository do QueryDSL com as devidas
	 * configurações
	 */
	@PostConstruct
	public void init() {
		JpaEntityInformation<Pessoa, Long> entidadeInfo = new JpaMetamodelEntityInformation<Pessoa, Long>(Pessoa.class, this.entidade.getMetamodel());
		repository = new QueryDslJpaRepository<Pessoa, Long>(entidadeInfo, this.entidade);
	}
	
	public void salvar(Pessoa aluno){
		repository.saveAndFlush(aluno);
	}
	
}
