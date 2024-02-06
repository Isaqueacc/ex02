package entities;

public class Saveprod {
	 public  String nome;
	 public double preco;
	 public int quant;
	 
	  public double totalval() {
		  return preco*quant;
		  
	  }
	  public void addprod(int quant){
		  
		 this.quant += quant;
	  }
	  public void removeprod(int quant) {
		  this.quant -= quant;
		  
	  }
	  
	  public String toString() {
		  return nome
		 + " , "
		 + quant
		 +" , "
		 + String.format("%.2f", preco)
		 + " Total: "
		 + String.format("%.2f", totalval());
		 
	  }
}

		 
		
