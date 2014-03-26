/**
 * 
 */
package net.com.scaiprojectv.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Comment(s): Classe modelo de aluno.
 * 
 * @author Paulo Garcia
 * @Feb 19, 2014
 * @5:14:27 PM
 * 
 * Scai Project_V®
 * 
 * Developed by Paulo Garcia
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pessoa")
	private Long id;
	
	@Column(nullable = true)
	private String nome;
	
	@Column(nullable = true)
	private String sobrenome;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date dataNascimento;
	
	@Column(nullable = true)
	private String rg;
	
	@Column(nullable = true, length = 14)
	private String cpf;
	
	@Column(nullable = true, length = 1)
	private Character sexo;
	
	@Column(length = 2)
	private String ddd;
	
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return "(" + ddd + ") " + telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		if(this.sexo.equals('M') || this.sexo.equals('m')){
			return "Masculino";
		}else if(this.sexo.equals('F') || this.sexo.equals('f')){
			return "Feminino";
		}else{
			return "Sexo não informado";
		}
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

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

	public String getSobreNome() {
		return sobrenome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobrenome = sobreNome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}

	public Integer getIdade(){
		int anoNascimento = new Date().getYear();
		int anoAtual = this.dataNascimento.getYear();
		return anoNascimento - anoAtual;
	}
	
		
	
}
