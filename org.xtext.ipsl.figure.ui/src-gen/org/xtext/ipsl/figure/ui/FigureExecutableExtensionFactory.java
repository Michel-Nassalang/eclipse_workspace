/*
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.figure.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.ipsl.figure.ui.internal.FigureActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FigureExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(FigureActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		FigureActivator activator = FigureActivator.getInstance();
		return activator != null ? activator.getInjector(FigureActivator.ORG_XTEXT_IPSL_FIGURE_FIGURE) : null;
	}

}