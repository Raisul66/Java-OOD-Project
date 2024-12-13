package classes;

import java.lang.*;

public class CostlyProduct extends Product
{
	private int price;
	
	public CostlyProduct(){}
	public CostlyProduct(String productName, Buyer buyer, int totalProduct, int price)
	{
		super(productName, buyer, totalProduct);
		this.price= price;
	}
	
	public void setPrice (int price){this.price= price;}
	public int getPrice(){return price;}
	
	public void showDetails()
	{
		System.out.println("**** Costly Product Information ****");
		this.getBuyer().showDetails();
		System.out.println("Product Name: " + this.getProductName());
		System.out.println("Total Product: " + this.getTotalProduct());
		System.out.println("Price: " + price);
		System.out.println();
	}
}