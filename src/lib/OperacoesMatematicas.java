package lib;

public class OperacoesMatematicas {
	public static float AplicaDesconto(float a, float b) {
		return a - (a * (b / 100));
	}

	public static float AplicaAcrecimo(float a, float b) {
		return a + (a * (b / 100));
	}

	public static float Amostragem(float a, float b) {
		return (a * b) / 100;
	}

	public static float Amostragem2(float a, float b) {
		return (a / b) * 100;
	}

	public static float DescontoAplicado(float a, float b) {
		return ((a - b) / a) * 100;
	}

	public static float VariacaoDelta(float a, float b) {
		return (b / a - 1) * 100;
	}

	public static float ValorOriginal(float a, float b) {
		return (a * 100 / (100 - b));
	}

	public static float RegraDeTres(float a, float b, float r1) {
		return (b * r1) / a;
	}

	public static String GeradorDeSenhas(boolean a, boolean b, boolean c, boolean d, int tam) {
		String lowCase = "abcdefghijklmnopqrstuvxyz";
		String upCase = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
		String Numbers = "0123456789";
		String SpecialChar = "£$&()*+[]@#^-_!?";
		// int charCategories = 4;
		int passLength = tam;




		return "";
	}

}
