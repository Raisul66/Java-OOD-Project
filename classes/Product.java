package classes;

import java.lang.*;
import interfaces.ProductCount;

public abstract class Product implements ProductCount
{	
	private String productName;
	private Buyer buyer;
	private int totalProduct;
	
	
	public Product(){ }
	public Product(String productName, Buyer buyer, int totalProduct)
	{
		this.productName = productName;
		this.buyer = buyer;
		this.totalProduct = totalProduct;
	}
	
	public void setProductName(String productName){ this.productName = productName; }
	public void setBuyer(Buyer buyer){	this.buyer = buyer;}
	public void setTotalProduct(int totalProduct){	this.totalProduct = totalProduct;	}
	
	public String getProductName(){	return productName;}
	public Buyer getBuyer() {return buyer;}
	public int getTotalProduct(){	return totalProduct;}
	
	public abstract void showDetails();
	
	public boolean addProduct(int added)
	{
		if(added>0)
		{
			totalProduct = totalProduct + added;
			return true;
		}
		return false;
	}
	public boolean soldProduct(int solded)
	{
		if(solded>0 && solded<= totalProduct)
		{
			totalProduct = totalProduct - solded;
			return true;
		}
		return false;
	}
}