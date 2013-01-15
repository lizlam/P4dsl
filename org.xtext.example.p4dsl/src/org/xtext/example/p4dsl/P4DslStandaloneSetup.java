
package org.xtext.example.p4dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class P4DslStandaloneSetup extends P4DslStandaloneSetupGenerated{

	public static void doSetup() {
		new P4DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

