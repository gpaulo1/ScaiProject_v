/**
 * 
 */
package net.com.scaiprojectv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Comment(s):
 * 
 * @author Paulo Garcia
 * @Feb 26, 2014
 * @10:00:40 AM
 * 
 *           Scai Project_V®
 * 
 *           Developed by Paulo Garcia
 */
@Entity
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = true)
	private String nome;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Matricula> matriculas = new ArrayList<Matricula>();

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

}
