
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InsuranceStandaloneSetup extends InsuranceStandaloneSetupGenerated{

	public static void doSetup() {
		new InsuranceStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

