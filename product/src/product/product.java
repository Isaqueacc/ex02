package product;

import java.util.Locale;
import java.util.Scanner;

import entities.Saveprod;

public class product {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 Saveprod saveprod = new Saveprod();
		  System.out.print("Digite o nome do produto: ");
		  saveprod.nome = sc.nextLine();
		  System.out.print("Digite a quantidade de produtos: ");
		  saveprod.quant = sc.nextInt();
		  System.out.print("Digite o valor do produto: ");
		   saveprod.preco = sc.nextDouble();
		    
		    System.out.println();
		    System.out.println("produtos: " + saveprod);
		    
		     System.out.println("Digite quantos produtos deseja adicionar: " );
		      int quant = sc.nextInt();
		      saveprod.addprod(quant);
		      
		      System.out.println();
		      System.out.println("novo Produtos: " + saveprod );
		      
		      System.out.println("Digite quantos produtos deseja remover: ");
		       quant = sc.nextInt();
		        saveprod.removeprod(quant);
		        
		        System.out.println();
		        System.out.println("novo Produtos: " + saveprod);
		    
		 
		 sc.close();
		 
		 }

}
