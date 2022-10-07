package lib;

public class OperacoesMatematicas {
	public float AplicaDesconto (float a, float b) {
		return a - (a *(b / 100));
	}
	
	public float AplicaAcrecimo (float a, float b) {
		return a + (a *(b / 100));
	}
	
	public float Amostragem (float a, float b) {
		return (a * b) / 100;
	}
	
	public float Amostragem2 (float a, float b) {
		return (a / b) * 100;
	}
	
	public float DescontoAplicado (float a, float b) {
		return ((a - b) / a ) * 100;
	}
	
	public float VariacaoDelta (float a, float b) {
		return (b / a - 1 ) * 100;
	}
	
	public float ValorOriginal (float a, float b) {
		return ( a * 100 / ( 100 - b));
	}
	
	public float RegraDeTres (float a, float b, float c) {
		return (c * b) / a ;
	}
	
}
