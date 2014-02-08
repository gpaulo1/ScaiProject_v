/**
 * 
 */
package net.com.scaiprojectv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Comment(s):
 * 
 * @author Paulo Garcia
 * @Feb 7, 2014
 * @11:08:46 PM
 * 
 *           Scai Project_V®
 * 
 *           Developed by Paulo Garcia
 */
@Entity
public class ModelTEste {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
