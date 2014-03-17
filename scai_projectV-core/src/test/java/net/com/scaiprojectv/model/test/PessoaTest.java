/**
 * 
 */
package net.com.scaiprojectv.model.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import junit.framework.Assert;
import net.com.scaiprojectv.model.Pessoa;

import org.junit.Test;

/**
 * Comment(s): 
 * 
 * @author Paulo Garcia
 * @Feb 20, 2014
 * @7:52:18 PM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
public class PessoaTest {

	private Pessoa pessoa;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public PessoaTest() throws ParseException{
		pessoa = new Pessoa();
		pessoa.setNome("Paulo");
		pessoa.setSobreNome("Garcia");
		pessoa.setDataNascimento(sdf.parse("18/05/1989"));
		pessoa.setRg("44.839.159-3");
		pessoa.setSexo('m');
		pessoa.setTelefone("3462-2016");
		pessoa.setDdd("17");
		pessoa.setCpf("394.714.358-38");
	}
	
	@Test
	public void deveTestarRetornoFormatadoSexo(){
		Assert.assertEquals("Masculino", pessoa.getSexo());
		pessoa.setSexo('M');
		Assert.assertEquals("Masculino", pessoa.getSexo());
		pessoa.setSexo('f');
		Assert.assertEquals("Feminino", pessoa.getSexo());
		pessoa.setSexo('F');
		Assert.assertEquals("Feminino", pessoa.getSexo());
		pessoa.setSexo('h');
		Assert.assertEquals("Sexo não informado", pessoa.getSexo());
	}
	
	@Test
	public void deveTestarRetornoFormatadoIdade(){
		Integer idade = pessoa.getIdade();
		Assert.assertEquals(idade.toString(), "25");
	}
	
	@Test
	public void deveTestarRetornoFormatadoTelefone(){
		Assert.assertEquals(pessoa.getTelefone(), "(17) 3462-2016"); 
	}
	
}
