package util;

import org.openqa.selenium.WebDriver;

public class Funcoes {
	public static Double removeCifraoDevolveDouble(String texto) {
		texto = texto.replace("$", "");
		return  Double.parseDouble(texto);
	}
	public static int removeTextoItemsDevolveInt(String texto) {
		texto = texto.replace(" items","");
		return Integer.parseInt(texto);
	}
	public static String removeTexto(String texto, String textoParaRemover) {
		texto = texto.replace(textoParaRemover,"");
			return texto;
	}
}
