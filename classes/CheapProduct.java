package classes;

import java.lang.*;

public class CheapProduct extends Product
{
	private int size;
	
	public CheapProduct(){}
	public CheapProduct(String productName, Buyer buyer, int totalProduct, int size)
	{
		super(productName, buyer, totalProduct);
		this.size = size;
	}
	
	public void setSize(int size){this.size = size;}
	public int getSize(){return size;}
	
	public void showDetails()
	{
		System.out.println("**** Cheap Product Information ****");
		this.getBuyer().showDetails();
		System.out.println("Product Name: " + this.getProductName());
		System.out.println("Total Product: " + this.getTotalProduct());
		System.out.println("Product Size: " + size);
		System.out.println();
	}
}