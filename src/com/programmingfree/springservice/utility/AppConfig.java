package com.programmingfree.springservice.utility;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

/*@Configuration
@EnableTransactionManagement
@ComponentScan("com.programmingfree.dao")*/
public class AppConfig {

	/*@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");
		return factoryBean;
	}
	
	@Bean
	public JpaTransactionManager geJpaTransactionManager() {
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
      return transactionManager;
   }*/
}
