/**
 * 
 */
package net.com.scaiprojectv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Comment(s): Classe modelo de Estado.
 * 
 * @author Paulo Garcia
 * @Feb 21, 2014
 * @8:02:28 AM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = true)
	private String nome;

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
	
	
}
