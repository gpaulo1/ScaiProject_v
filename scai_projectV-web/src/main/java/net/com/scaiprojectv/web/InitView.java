/**
 * 
 */
package net.com.scaiprojectv.web;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.view.tiles3.TilesView;

/**
 * Comment(s): 
 * 
 * @author Paulo Garcia
 * @Mar 7, 2014
 * @7:23:58 PM
 *
 * Scai Project_V®
 *
 * Developed by Paulo Garcia
 */
public class InitView extends TilesView{

	/**
	 * 
	 */
	public static final String SPRING_MACRO_REQUEST_CONTEXT_ATTRIBUTE = "springMacroRequestContext";

	private boolean exposeSpringMacroHelpers = true;

	// @Autowired
	// private IServicoService servicoService;

	/**
	 * @param exposeSpringMacroHelpers
	 */
	public void setExposeSpringMacroHelpers(boolean exposeSpringMacroHelpers) {
		this.exposeSpringMacroHelpers = exposeSpringMacroHelpers;
	}

	/**
	 * @return {@link Boolean}
	 */
	public boolean getExposeSpringMacroHelpers() {
		return exposeSpringMacroHelpers;
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (exposeSpringMacroHelpers) {
			if (model.containsKey(SPRING_MACRO_REQUEST_CONTEXT_ATTRIBUTE)) {
				throw new ServletException("Cannot expose bind macro helper '" + SPRING_MACRO_REQUEST_CONTEXT_ATTRIBUTE + "' because of an existing model object of the same name");
			}
			model.put(SPRING_MACRO_REQUEST_CONTEXT_ATTRIBUTE, new RequestContext(request, response, getServletContext(), model));
		}

		model.put("LAYOUT", request.getParameter("XHRLayout") == null);

		super.renderMergedOutputModel(model, request, response);
	}
	
}
