package View;

import java.util.ArrayList;
import java.util.List;

import Model.DiaVendas;
import Model.NotaFiscal;
import Model.TotalizadorVendas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<NotaFiscal> notasDia1 = new ArrayList<NotaFiscal>();
		
		for(int i=0; i < 1000; i++){
			NotaFiscal n = new NotaFiscal();
			n.setNomeNota("Nota " + 1);
			n.setValorTotal((double)i);
			notasDia1.add(n);
		}	
		DiaVendas dia1 = new DiaVendas();
		dia1.setNotasDia(notasDia1);
		
		List<NotaFiscal> notasDia2 = new ArrayList<NotaFiscal>();
		for(int i=0; i < 1000; i++){
			NotaFiscal n = new NotaFiscal();
			n.setNomeNota("Nota " + 1);
			n.setValorTotal((double)i);
			notasDia2.add(n);
		}
		DiaVendas dia2 = new DiaVendas();
		dia2.setNotasDia(notasDia2);
		
		/*TotalizadorVendas totalizadorVendas = new TotalizadorVendas();
		Double totalDia1 = totalizadorVendas.totalizarVendasDia(dia1);
		Double totalDia2 = totalizadorVendas.totalizarVendasDia(dia2);
		System.out.println("Total do dia 1: " + totalDia1 );
		System.out.println("Total do dia 2: " + totalDia2 );*/
		
		try {
			//criação dos totalizadores
			TotalizadorVendas tot1 = new TotalizadorVendas(dia1);
			TotalizadorVendas tot2 = new TotalizadorVendas(dia2);
			
			//Uma thread para cada totalizador
			Thread thread1 = new Thread(tot1);
			Thread thread2 = new Thread(tot2);
			
			//colocando as threads para rodar em separado da thread atual
			thread1.start();
			thread2.start();
			
			//só continue a execução da thread principal depois que thread1 tenha terminado
			thread1.join();
			//só continue a execução da thread principal depois que thread2 tenha terminado
			thread2.join();
			
			//imprimindo os resultados
			System.out.println("Total do dia 1: " + tot1.getResultado() );
			System.out.println("Total do dia 2: " + tot2.getResultado());
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
