package calculador;

import matriz.LinhaMatriz;

public class SomaLinhas
  implements Runnable
{
  private final LinhaMatriz linhaMatriz1;
  private final LinhaMatriz linhaMatriz2;
  private LinhaMatriz resultado;
  
  public SomaLinhas(LinhaMatriz linhaMatriz1, LinhaMatriz linhaMatriz2)
  {
    this.linhaMatriz1 = linhaMatriz1;
    this.linhaMatriz2 = linhaMatriz2;
  }
  
  public LinhaMatriz getLinhaMatriz1()
  {
    return this.linhaMatriz1;
  }
  
  public LinhaMatriz getLinhaMatriz2()
  {
    return this.linhaMatriz2;
  }
  
  public LinhaMatriz getResultado()
  {
    return this.resultado;
  }
  
  public void run()
  {
    if (this.linhaMatriz1.getNumColunas() != this.linhaMatriz2.getNumColunas()) {
      throw new RuntimeException("Impossivel somar. As linhas possuem numeros de colunas diferentes");
    }
    this.resultado = new LinhaMatriz(this.linhaMatriz1.getNumColunas());
    for (int i = 0; i < this.linhaMatriz1.getNumColunas(); i++) {
      this.resultado.inserir(Double.valueOf(this.linhaMatriz1.getColuna(i).doubleValue() + this.linhaMatriz2.getColuna(i).doubleValue()));
    }
  }
}