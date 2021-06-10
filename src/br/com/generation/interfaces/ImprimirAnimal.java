package br.com.generation.interfaces;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro ();
		Cavalo c2 = new Cavalo ();
		Preguica p1 = new Preguica ();
		
		c1.setNome("Billy");
		System.out.println("O nome do cachorro é: " + c1.getNome());
		c1.setIdade(6);
		System.out.println("Billy tem: " + c1.getIdade() + " anos");
		c1.som();
		c1.correr();
		
		System.out.println();
		
		c2.setNome("Klaus");
		System.out.println("O nome do cavalo é: " + c2.getNome());
		c2.setIdade(10);
		System.out.println("Klaus tem: " + c2.getIdade() + " anos");
		c2.som();
		c2.correr();
		
		System.out.println();
		
		p1.setNome("Sara");
		System.out.println("O nome da preguiça é: " + p1.getNome());
		p1.setIdade(22);
		System.out.println("Sara tem: " + p1.getIdade() + " anos");
		p1.som();
		p1.subir();	
		
	}

}
