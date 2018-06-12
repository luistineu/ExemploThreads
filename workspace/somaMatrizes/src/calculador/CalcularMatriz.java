package calculador;

import matriz.Matriz;

public class CalcularMatriz
{
  public Matriz somarMatrizes(Matriz matriz1, Matriz matriz2)
    throws Exception
  {
    if (matriz1.getNumLinhas() != matriz2.getNumLinhas()) {
      throw new Exception("Imposs�vel somar. As matrizes possuem diferentes n�meros de linhas.");
    }
    Thread[] threads = new Thread[matriz1.getNumLinhas()];
    SomaLinhas[] somadores = new SomaLinhas[matriz1.getNumLinhas()];
    for (int i = 0; i < matriz1.getNumLinhas(); i++)
    {
      somadores[i] = new SomaLinhas(matriz1.getLinha(i), matriz2.getLinha(i));
      threads[i] = new Thread(somadores[i]);
      threads[i].start();
    }
    Thread[] arrayOfThread1;
    int j = (arrayOfThread1 = threads).length;
    for (int i = 0; i < j; i++)
    {
      Thread t = arrayOfThread1[i];
      t.join();
    }
    Matriz resultado = new Matriz(matriz1.getNumLinhas());
    SomaLinhas[] arrayOfSomaLinhas1;
    int k = (arrayOfSomaLinhas1 = somadores).length;
    for (j = 0; j < k; j++)
    {
      SomaLinhas sl = arrayOfSomaLinhas1[j];
      resultado.adicionarLinha(sl.getResultado());
    }
    return resultado;
  }
}
