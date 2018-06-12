
import java.io.PrintStream;
import java.util.List;
import matriz.Matriz;
import conversor.ConversorMatriz;
import calculador.CalcularMatriz;

public class Main
{
  public static void main(String[] args)
  {
    try
    {
      System.out.println("CALCULADORA DE MATRIZES");
      
      ConversorMatriz parser = new ConversorMatriz();
      List<Matriz> matrizes = parser.preencherMatrizesStdin();
      
      CalcularMatriz calcularM = new CalcularMatriz();
      
      System.out.println("Matriz 1\n");
      System.out.println(matrizes.get(0));
      System.out.println("\nMatriz 2");
      System.out.println(matrizes.get(1));
      System.out.println("\nSoma");
      System.out.println(calcularM.somarMatrizes((Matriz)matrizes.get(0), (Matriz)matrizes.get(1)));
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}