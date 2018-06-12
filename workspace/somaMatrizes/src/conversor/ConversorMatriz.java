package conversor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import matriz.LinhaMatriz;
import matriz.Matriz;

public class ConversorMatriz
{
  public List<Matriz> preencherMatrizesStdin()
    throws Exception
  {
    Scanner br = null;
    try
    {
      br = new Scanner(System.in);
      List<Matriz> retorno = new ArrayList(2);
      int numLinhas = br.nextInt();
      
      br.nextLine();
      Integer numColunas = null;
      
      Matriz m1 = new Matriz(numLinhas);
      int j;
      for (int i = 0; i < numLinhas; i++)
      {
        String linha = br.nextLine();
        String[] componentes = linha.split(" ");
        if (numColunas != null)
        {
          if (componentes.length != numColunas.intValue()) {
            throw new Exception("As linhas das matrizes possuem diferentes numeros de colunas!");
          }
        }
        else {
          numColunas = Integer.valueOf(componentes.length);
        }
        LinhaMatriz lMatriz = new LinhaMatriz(numColunas.intValue());
        String[] arrayOfString1;
        j = (arrayOfString1 = componentes).length;
        for (int i1 = 0; i1 < j; i1++)
        {
          String c = arrayOfString1[i1];
          lMatriz.inserir(Double.valueOf(Double.parseDouble(c)));
        }
        m1.adicionarLinha(lMatriz);
      }
      Matriz m2 = new Matriz(numLinhas);
      for (int i = 0; i < numLinhas; i++)
      {
        String linha = br.nextLine();
        String[] componentes = linha.split(" ");
        if (numColunas != null)
        {
          if (componentes.length != numColunas.intValue()) {
            throw new Exception("As linhas das matrizes possuem diferentes numeros de colunas!");
          }
        }
        else {
          numColunas = Integer.valueOf(componentes.length);
        }
        LinhaMatriz lMatriz = new LinhaMatriz(numColunas.intValue());
        String[] arrayOfString2;
        int k = (arrayOfString2 = componentes).length;
        for (j = 0; j < k; j++)
        {
          String c = arrayOfString2[j];
          lMatriz.inserir(Double.valueOf(Double.parseDouble(c)));
        }
        m2.adicionarLinha(lMatriz);
      }
      retorno.add(m1);
      retorno.add(m2);
      
      return retorno;
    }
    finally
    {
      if (br != null) {
        br.close();
      }
    }
  }
}
