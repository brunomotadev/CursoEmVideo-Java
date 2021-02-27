package primeiroprograma;

import java.util.Locale;

public class IdiomaSistema {
//mostrando o idioma do sistema em Java
	public static void main(String[] args) {
		Locale idiomaAtual = Locale.getDefault();
		System.out.println(idiomaAtual.getDisplayLanguage());
		System.out.println(idiomaAtual.getDisplayCountry());
		
		System.out.println(idiomaAtual.getLanguage());
		System.out.println(idiomaAtual.getCountry());
		
		System.out.println(System.getProperty("user.country"));
		System.out.println(System.getProperty("user.language"));
	}
}
