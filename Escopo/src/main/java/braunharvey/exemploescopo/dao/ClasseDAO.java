package braunharvey.exemploescopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Harvey Braun
 * @version 1.0
 * @since 20.04.2020
 */
@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
	   proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter @Setter
public class ClasseDAO {

	@Autowired
	private ClasseJDBC objetoJDBC;

	/*
	public ClasseDAO(ClasseJDBC objetoJDBC) {
		this.objetoJDBC = objetoJDBC;
	}
	*/

}
