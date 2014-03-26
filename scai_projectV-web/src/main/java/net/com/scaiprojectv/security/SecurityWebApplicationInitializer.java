/**
 * 
 */
package net.com.scaiprojectv.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Comment(s): 
 * 
 * @author Paulo Garcia
 * @Mar 24, 2014
 * @8:06:43 PM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer{

	 protected Class<?>[] getRootClasses(){
	        return new Class[] { SecurityConfig.class };
	    }
	
}
