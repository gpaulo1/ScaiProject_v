/**
 * 
 */
package net.com.scaiprojectv.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.test.annotation.Timed;

/**
 * Comment(s): 
 * 
 * @author Paulo Garcia
 * @Feb 26, 2014
 * @4:15:26 PM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
@Entity
public class HorarioDiaAula {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = true)
	private Short diaSemana;
	
	@Temporal(TemporalType.TIME)
	private Date horarioInicio;
	
	@ManyToMany(mappedBy = "horariosAulas")
	private List<Turma> turmas;
	

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Long getId() {
		return id;
	}

	public Short getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(Short diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Date getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	
	
	
}
