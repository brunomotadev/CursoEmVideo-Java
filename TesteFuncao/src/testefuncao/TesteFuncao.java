package testefuncao;

public class TesteFuncao {
	
	static int soma(int a, int b) {//static deixa funcional apenas na classe.
		int s = a + b;
		return s;
	}

	public static void main(String[] args) {// não posso chamar um método static dentro de um que não é static
		// TODO Auto-generated method stub
		System.out.println("Começou o programa");
		int sm = soma(5,2);
		System.out.println("A soma vale "+ sm);
	}

}
