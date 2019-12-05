package __MeterSample__.generated;

import ej.components.registry.BundleRegistry;
import ej.wadapps.registry.SharedRegistryFactory;

@SuppressWarnings("all")
public class BackgroundServicesStandalone {

	public static void main(String[] args) {
		SharedRegistryFactory.getSharedRegistry().register(BundleRegistry.class, new WadappsRegistry());

		// Start entry point.
		new MeterSampleEntryPoint().start();

		// Background services are automatically launched.
	}

}