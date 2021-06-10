package br.com.generation.interfaces;

public class Cachorro extends AnimalSuper implements Animal {

	@Override
	public void som() {
		
		System.out.println("Billy faz: AU AU AU");
		// TODO Auto-generated method stub
		
	}
	
	public void correr () {
		
		System.out.println("Billy correndo...");
	}

}
