package objetofisico;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone smart = new Smartphone();
		smart.bateria = 30;
		smart.cor = "Azul";
		smart.modelo = "Zenfone";
		smart.tela = true;

		smart.liga();
		smart.acessaInternet();
		smart.ligacao();
	}

}
