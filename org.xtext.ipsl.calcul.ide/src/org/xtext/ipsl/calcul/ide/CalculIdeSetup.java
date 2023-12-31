/*
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.calcul.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.ipsl.calcul.CalculRuntimeModule;
import org.xtext.ipsl.calcul.CalculStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CalculIdeSetup extends CalculStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CalculRuntimeModule(), new CalculIdeModule()));
	}
	
}
