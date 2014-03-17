/**
 * 
 */
package net.com.scaiprojectv.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Comment(s):
 * 
 * @author Paulo Garcia
 * @Feb 21, 2014
 * @10:59:42 AM
 * 
 *           Scai Project_V®
 * 
 *           Developed by Paulo Garcia
 */
@Entity
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = true)
	private Integer numeroMatricula;

	@Column(nullable = true)
	private Date dataMatricula;

	@ManyToOne
	private Funcionario funcionario;

	@ManyToMany(mappedBy = "matriculas")
	private List<Materia> materias;

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Long getId() {
		return id;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

}
