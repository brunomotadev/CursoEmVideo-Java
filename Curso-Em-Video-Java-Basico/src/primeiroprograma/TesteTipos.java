package primeiroprograma;

public class TesteTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 30;
		String numero = "30";
		String valorDecimal = "30.5";
		
		String valor = Integer.toString(idade);// converte inteiro para string
		int numeroIdade = Integer.parseInt(numero); // converte string para inteiro
		float testeDecimal = Float.parseFloat(valorDecimal); // converte string pra float
		
		System.out.println(valor);
		System.out.println(numero);
		System.out.println(testeDecimal);
	}

}
