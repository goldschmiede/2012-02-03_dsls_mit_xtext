/*
 * generated by Xtext
 */
package de.goldschmiede.mapdsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MapDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return de.goldschmiede.mapdsl.ui.internal.MapDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return de.goldschmiede.mapdsl.ui.internal.MapDslActivator.getInstance().getInjector("de.goldschmiede.mapdsl.MapDsl");
	}
	
}
