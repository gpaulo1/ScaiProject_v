/**
 * 
 */
package net.com.saciprojectv.configuration;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * Comment(s): Classe de configuração do contexto do Spring
 * 
 * @author Paulo Garcia
 * @Feb 7, 2014
 * @12:00:03 PM
 * 
 *           Scai Project_V®
 * 
 *           Developed by Paulo Garcia
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "net.com.scaiprojectv.controller" })
@EnableJpaRepositories(value = { "net.com.scaiprojectv.repository.impl" })
@Import(value = net.com.scaiprojectv.config.ApplicationContext.class)
public class ApplicationContext extends WebMvcConfigurerAdapter {

	private static final String DEFINICAO_TILES_PADRAO = "/WEB-INF/web-tiles.xml";
	private static final String DEFINICAO_TILES_PADRAO2 = "/WEB-INF/views/**/tiles-*.xml";

	private static final Logger logger = Logger
			.getLogger(ApplicationContext.class);

	@Bean
	public TilesConfigurer configuracaoTiles() {
		logger.info("Inicializando Tiles Configurer...");
		TilesConfigurer config = new TilesConfigurer();
		String[] definicoes = new String[2];
		definicoes[0] = DEFINICAO_TILES_PADRAO;
		definicoes[1] = DEFINICAO_TILES_PADRAO2;
		config.setDefinitions(definicoes);
		return config;
	}

	@Bean
	public TilesViewResolver tileViewResolver() {
		logger.info("Inicializando Tiles ViewResolver...");
		return new TilesViewResolver();
	}

}
