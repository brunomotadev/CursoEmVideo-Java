package testefuncao;

public class TesteFuncao {
	
	static int soma(int a, int b) {//static deixa funcional apenas na classe.
		int s = a + b;
		return s;
	}

	public static void main(String[] args) {// n�o posso chamar um m�todo static dentro de um que n�o � static
		// TODO Auto-generated method stub
		System.out.println("Come�ou o programa");
		int sm = soma(5,2);
		System.out.println("A soma vale "+ sm);
	}

}
