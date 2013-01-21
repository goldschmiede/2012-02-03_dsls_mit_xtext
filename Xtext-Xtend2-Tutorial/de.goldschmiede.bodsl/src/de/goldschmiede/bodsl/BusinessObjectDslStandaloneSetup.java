
package de.goldschmiede.bodsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BusinessObjectDslStandaloneSetup extends BusinessObjectDslStandaloneSetupGenerated{

	public static void doSetup() {
		new BusinessObjectDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

