/**
 * 
 */
package net.com.saciprojectv.configuration;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.jolbox.bonecp.BoneCPDataSource;

/**
 * Comment(s):Classe de configuração do contexto do Spring
 * 
 * @author Paulo Garcia
 * @Feb 7, 2014
 * @12:00:03 PM
 * 
 * Scai Project_V®
 * 
 * Developed by Paulo Garcia
 */
@Configuration
@ComponentScan(basePackages = { "net.com.scaiprojectv.controller" })
@EnableJpaRepositories("net.com.scaiprojectv.repository")
@EnableWebMvc
@ImportResource("classpath:applicationContext.xml")
@PropertySource("classpath:application.properties")
public class ApplicationContext extends WebMvcConfigurerAdapter {

	@Resource
	private Environment em;

	private static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/jsp/";
    private static final String VIEW_RESOLVER_SUFFIX = ".jsp";
	
	private static final Logger logger = Logger.getLogger(ApplicationContext.class);
	
	@Bean
	public DataSource dataSource() {
		logger.info("Iniciando a aplicação de configuração");
		BoneCPDataSource ds = new BoneCPDataSource();
		ds.setDriverClass(em.getRequiredProperty("db.driver"));
		ds.setJdbcUrl(em.getRequiredProperty("db.url"));
		ds.setUsername(em.getRequiredProperty("db.username"));
		ds.setPassword(em.getRequiredProperty("db.password"));
		logger.info("dataSource carregado com sucesso!");
		return ds;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		logger.info("Iniciando configuração entity manager");
		LocalContainerEntityManagerFactoryBean local = new LocalContainerEntityManagerFactoryBean();
		local.setDataSource(dataSource());
		local.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		local.setPackagesToScan(em.getRequiredProperty("entitymanager.packages.to.scan"));
		Properties p = new Properties();
		p.put("hibernate.dialect", em.getRequiredProperty("hibernate.dialect"));
		p.put("hibernate.format_sql", em.getRequiredProperty("hibernate.format_sql"));
		p.put("hibernate.hbm2ddl.auto", em.getRequiredProperty("hibernate.hbm2ddl.auto"));
		p.put("hibernate.ejb.naming_strategy", em.getRequiredProperty("hibernate.ejb.naming_strategy"));
		p.put("hibernate.show_sql", em.getRequiredProperty("hibernate.show_sql"));
		local.setJpaProperties(p);
		logger.info("entity manager carregada com sucesso!");
		return local;
	}
	
	@Bean
	public JpaTransactionManager transactionManager() {
		logger.info("Iniciando configuração TransactionManager");
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		logger.info("TransactionManager carregada com sucesso!");
		return transactionManager;
	}
	
	 @Bean
	    public ViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

	        viewResolver.setPrefix(VIEW_RESOLVER_PREFIX);
	        viewResolver.setSuffix(VIEW_RESOLVER_SUFFIX);
	        viewResolver.setViewClass(JstlView.class);
	        
	        return viewResolver;
	    }
	
}
