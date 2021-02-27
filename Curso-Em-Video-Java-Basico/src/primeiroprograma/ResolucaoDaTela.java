package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

	public static void main(String[] args) {
		Dimension tamanhoDaTela = Toolkit.getDefaultToolkit().getScreenSize();
		//System.out.println(tamanhoDaTela);
		double largura = tamanhoDaTela.getWidth();
		double altura = tamanhoDaTela.getHeight();
		
		System.out.printf("A largura da sua tela é de: %.2f por %.2f",largura,altura);
	}
}
