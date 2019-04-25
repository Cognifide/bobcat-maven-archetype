package @packageName@;

import com.google.inject.Guice;
import com.google.inject.Injector;

import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

import com.cognifide.qa.bb.modules.BobcatRunModule;

public class CucumberInjectorSource implements InjectorSource {

	@Override
	public Injector getInjector() {
		return Guice.createInjector(CucumberModules.createScenarioModule(), new BobcatRunModule());
	}

}
