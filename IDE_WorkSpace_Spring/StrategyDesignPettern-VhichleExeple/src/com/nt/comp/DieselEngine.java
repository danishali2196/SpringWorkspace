package com.nt.comp;

public class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("DieselEngine::Engine start()");

	}

	@Override
	public void stop() {

		System.out.println("DieselEngine:: Engine stop()");

	}

}
