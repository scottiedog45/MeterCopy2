package __MeterSample__.generated;

import ej.wadapps.management.BackgroundServicesList;

import ej.components.dependencyinjection.ServiceLoaderFactory;
import ej.components.registry.BundleActivator;

@SuppressWarnings("all")
public class MeterSampleActivator implements BundleActivator {

	com.landisgyr.MeterSample.MeterSample com__landisgyr__MeterSample__MeterSample;

	@Override
	public void initialize() {
		this.com__landisgyr__MeterSample__MeterSample = new com.landisgyr.MeterSample.MeterSample();
	}

	@Override
	public void link() {
		BackgroundServicesList backgroundserviceslist = ServiceLoaderFactory.getServiceLoader().getService(BackgroundServicesList.class);
		backgroundserviceslist.add(this.com__landisgyr__MeterSample__MeterSample);

	}

	@Override
	public void start() {
	}

	@Override
	public void stop() {
		BackgroundServicesList backgroundserviceslist = ServiceLoaderFactory.getServiceLoader().getService(BackgroundServicesList.class);
		backgroundserviceslist.remove(this.com__landisgyr__MeterSample__MeterSample);

	}

}