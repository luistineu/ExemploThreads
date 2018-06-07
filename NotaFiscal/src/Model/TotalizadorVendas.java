package Model;

public class TotalizadorVendas implements Runnable {
	
	private final DiaVendas dia;
	private Double resultado;
	
	public TotalizadorVendas(DiaVendas dia) {
		this.dia = dia;
	}
	
	public DiaVendas getDia() {
		return dia;
	}
	
	public Double getResultado() {
		return resultado;
	}
	
	/*public Double totalizarVendasDia(DiaVendas dia){
			Double resultado = 0.0;
			
			for(NotaFiscal n : dia.getNotasDia()){
				resultado += n.getValorTotal();
			}
			return resultado;
		}*/
	
	@Override
	public void run() {
		resultado = 0.0;
		
		for(NotaFiscal n : dia.getNotasDia()){
			resultado += n.getValorTotal();
		}
	}

}
