package Poliformismo;

public class Preguica extends Animal{
	
	public Preguica()
	{
		super("Pregui�a");
	}

	
	@Override
	public void Nome(String nomeAnimal)
	{
		System.out.println("\nNome da pregui�a: "+nomeAnimal);
	}
	
	@Override
	public void Idade1(int idadeAnimal)
	{
		System.out.println("\nIdade: "+idadeAnimal);
	}
	
	@Override
	public void Som1(String somAnimal)
	{
		System.out.println("\nSom que a sua pregui�a emite: "+somAnimal);
	}
	
	public void localizacao()
	{
		System.out.println("\nUma das caracter�sticas da pregui�a � ser encontrada na Am�rica Central e do Sul.");
	}



}
