package matriz;

import java.util.ArrayList;
import java.util.List;

public class LinhaMatriz
{
  List<Double> colunas;
  
  public boolean inserir(Double e)
  {
    return this.colunas.add(e);
  }
  
  public void inserirNaColuna(int index, Double element)
  {
    this.colunas.add(index, element);
  }
  
  public Double getColuna(int index)
  {
    return (Double)this.colunas.get(index);
  }
  
  public LinhaMatriz(int numColunas)
  {
    this.colunas = new ArrayList(numColunas);
  }
  
  public LinhaMatriz()
  {
    this.colunas = new ArrayList();
  }
  
  public int getNumColunas()
  {
    return this.colunas.size();
  }
  
  public String toString()
  {
    if (this.colunas.size() < 1) {
      return new String();
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < this.colunas.size() - 1; i++)
    {
      builder.append(this.colunas.get(i));
      builder.append('\t');
    }
    builder.append(this.colunas.get(this.colunas.size() - 1));
    return builder.toString();
  }
}
