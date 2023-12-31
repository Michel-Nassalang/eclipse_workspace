/*
 * generated by Xtext 2.29.0
 */
package org.xtext.ipsl.calcul.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.ipsl.calcul.ui.internal.CalculActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CalculExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CalculActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CalculActivator activator = CalculActivator.getInstance();
		return activator != null ? activator.getInjector(CalculActivator.ORG_XTEXT_IPSL_CALCUL_CALCUL) : null;
	}

}
