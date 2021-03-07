package aula02criandoclasseseobjetos;

public class Aula02CriandoClassesObjetos {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();//instanciada
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar(); //referencia a atributo
		
		c1.status(); //referencia a metodo
		c1.rabiscar();
		System.out.println();
		Caneta c2 = new Caneta();
		c2.modelo = "Hostenet";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		
	}

}
