package classes;

import java.lang.*;
import interfaces.*;

public class Factory implements ProductOperations, EmployeeOperations, BuyerOperations
{
	private String facName;
	private String facBranchName;
	Product products[] = new Product [1000];
	Buyer buyers[] = new Buyer [500];
	Employee employees[] = new Employee [100];
	
	public Factory(){}
	public Factory(String facName, String facBranchName)
	{
		this.facName = facName;
		this.facBranchName = facBranchName;
	}
	
	public void setFacName(String facName){this.facName = facName;}
	public void setFacBranchName(String facBranchName){this.facBranchName = facBranchName;}
	
	public String getFacName(){return facName;}
	public String getFacBranchName(){return facBranchName;}

	public boolean insertProduct(Product a)
	{
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeProduct(Product a)
	{
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == a)
			{
				products[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Product searchProduct(String productName)
	{
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getProductName().equals(productName))
				{
					return products[i];
				}
			}
		}
		return null;
	}
	
	public void showAllProducts()
	{
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				products[i].showDetails();
			}
		}
	}
	
	
	//**************************************************************

	
	public boolean insertBuyer(Buyer c)
	{
		for(int i=0; i<buyers.length; i++)
		{
			if(buyers[i] == null)
			{
				buyers[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeBuyer(Buyer c)
	{
		for(int i=0; i<buyers.length; i++)
		{
			if(buyers[i] == c)
			{
				buyers[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Buyer searchBuyer(int nid)
	{
		for(int i=0; i<buyers.length; i++)
		{
			if(buyers[i] != null)
			{
				if(buyers[i].getNid() == nid)
				{
					return buyers[i];
				}
			}
		}
		return null;
	}
	
	public void showAllBuyers()
	{
		for(int i=0; i<buyers.length; i++)
		{
			if(buyers[i] != null)
			{
				buyers[i].showDetails();
			}
		}
	}
	
	
//**************************************************************


	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Factory Name: " + facName);
		System.out.println("Factory Branch Name: " + facBranchName);
		System.out.println("//////////////////////////////////");
		System.out.println("### List of Products ###");
		this.showAllProducts();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("###  List of Employees  ###");
		this.showAllEmployees();
		System.out.println("//////////////////////////////////");
		
	}	
}