/*
 * generated by Xtext 2.30.0
 */
package org.xtext.ipsl.airport.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.ipsl.airport.ui.internal.AirportActivator;

public class AirPortUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AirportActivator.getInstance().getInjector("org.xtext.ipsl.airport.AirPort");
	}

}
