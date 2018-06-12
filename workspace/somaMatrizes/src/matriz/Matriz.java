package matriz;

import java.util.ArrayList;
import java.util.List;

public class Matriz {
	private List<LinhaMatriz> linhas;
	  
	  public Matriz(int numLinhas)
	  {
	    this.linhas = new ArrayList();
	  }
	  
	  public void adicionarLinha(int index, LinhaMatriz element)
	  {
	    this.linhas.add(index, element);
	  }
	  
	  public boolean adicionarLinha(LinhaMatriz e)
	  {
	    return this.linhas.add(e);
	  }
	  
	  public LinhaMatriz getLinha(int index)
	  {
	    return (LinhaMatriz)this.linhas.get(index);
	  }
	  
	  public int getNumLinhas()
	  {
	    return this.linhas.size();
	  }
	  
	  public String toString()
	  {
	    if (this.linhas.size() < 1) {
	      return new String();
	    }
	    StringBuilder builder = new StringBuilder();
	    for (LinhaMatriz lm : this.linhas)
	    {
	      builder.append('|');
	      builder.append(lm.toString());
	      builder.append("|\n");
	    }
	    return builder.toString();
	  }
}
