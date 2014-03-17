/**
 * 
 */
package net.com.scaiprojectv.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import net.com.scaiprojectv.enumerator.AcessoSistemaEnum;

/**
 * Comment(s): Classe modelo de "Funcionanrio" que herda "Pessoa".
 * 
 * @author Paulo Garcia
 * @Feb 21, 2014
 * @11:12:21 AM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
@Entity
@PrimaryKeyJoinColumn(name = "id_pessoa")
public class Funcionario extends Pessoa{

	@Column(nullable = true)
	private Date dataAdmissao;
	
	private Double salario;
	
	private Short diaVencimentoSalario;

	@Column(nullable = true)
	private String funcao;
	
	@Column(nullable = true)
	private String login;
	
	@Column(nullable = true)
	private String senha;
	
	@Column(nullable = true)
	private AcessoSistemaEnum acessoSistema;

//	@OneToMany(mappedBy = "funcionario", targetEntity = Matricula.class)	
//	private List<Matricula> matriculas;
	
	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Short getDiaVencimentoSalario() {
		return diaVencimentoSalario;
	}

	public void setDiaVencimentoSalario(Short diaVencimentoSalario) {
		this.diaVencimentoSalario = diaVencimentoSalario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public AcessoSistemaEnum getAcessoSistema() {
		return acessoSistema;
	}

	public void setAcessoSistema(AcessoSistemaEnum acessoSistema) {
		this.acessoSistema = acessoSistema;
	}
	
	
	
}
