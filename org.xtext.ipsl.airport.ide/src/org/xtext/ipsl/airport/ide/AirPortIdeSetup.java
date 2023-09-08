/*
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.airport.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.ipsl.airport.AirPortRuntimeModule;
import org.xtext.ipsl.airport.AirPortStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class AirPortIdeSetup extends AirPortStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AirPortRuntimeModule(), new AirPortIdeModule()));
	}
	
}
