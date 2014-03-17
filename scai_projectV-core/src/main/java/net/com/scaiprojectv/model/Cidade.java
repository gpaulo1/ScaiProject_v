/**
 * 
 */
package net.com.scaiprojectv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Comment(s): Classe modelo de cidade.
 * 
 * @author Paulo Garcia
 * @Feb 21, 2014
 * @8:31:34 AM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
@Entity
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = true)
	private String nome;
	
	@ManyToOne
	private Estado estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
}
