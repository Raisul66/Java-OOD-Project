import java.lang.*;
import classes.*;
import java.util.Scanner;
import fileio.FileReadWriteDemo;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		String fn, bn;
		System.out.print("Enter Factory Name: ");
		fn = sc.next();
		System.out.print("Enter Factory Branch: ");
		bn = sc.next();
		Factory f = new Factory(fn, bn);
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$$   Welcome to "+f.getFacName()+" Application  $$$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println();
			System.out.println("\tWhat Do You Want To Do?\n");
			System.out.println("\t\t1. Employee Management");
			System.out.println("\t\t2. Buyer Management");
			System.out.println("\t\t3. Product Management");
			System.out.println("\t\t4. Product Count");
			System.out.println("\t\t5. Show Factory Information");
			System.out.println("\t\t6. Exit");
			System.out.println();
				
			System.out.println("\n---------------------------");
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			
			switch(choice)
			{
				case 1:
					
					System.out.println("#####################################");
					System.out.println("You Have Selected Employee Management");
					System.out.println("#####################################");
					System.out.println();
					System.out.println();
					
					boolean repeat1 = true;
					
					while(repeat1)
					{
					
						System.out.println("\tEmployee Management Options are: \n");
						System.out.println("\t\t1. Insert New Employee");
						System.out.println("\t\t2. Remove Employee");
						System.out.println("\t\t3. Search Employee");
						System.out.println("\t\t4. Show All Employees");
						System.out.println("\t\t5. Go Back");
						System.out.println();
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option1 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option1)
						{
							case 1:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Insert Employee");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter Employee ID: ");
								String empId1 = sc.next();
								System.out.print("Enter Employee Name: ");
								String name1 = sc.next();
								System.out.print("Enter Salary: ");
								double salary1 = sc.nextDouble();
								
								Employee e1 = new Employee();
								e1.setEmpId(empId1);
								e1.setName(name1);
								e1.setSalary(salary1);
								
								if(f.insertEmployee(e1))
								{	
									System.out.println();
									System.out.println(empId1 + " Employee Has Been Inserted");
									System.out.println();
								}
								else
								{
									System.out.println();
									System.out.println(empId1 + " Employee Can NOT be Inserted");
									System.out.println();
								}

								break;
								
							case 2:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Remove Employee");
								System.out.println("*********************************");
								System.out.println();
								System.out.println();

								System.out.print("Enter The ID to remove a Employee: ");
								String empId2 = sc.next();
								System.out.println();
								
								Employee e2 = f.searchEmployee(empId2);
								
								if(e2 != null)
								{
									if(f.removeEmployee(e2))
									{
										System.out.println();
										System.out.println("*** Employee Removed ***");
										System.out.println();
									}
								}
								else
								{
									System.out.println();
									System.out.println("*** Employee Can NOT be Removed ***");
									System.out.println();
								}

								break;
								
							case 3:
							
								System.out.println("*********************************");
								System.out.println("You Have Selected Search Employee");
								System.out.println("*********************************");
								System.out.println();

								System.out.print("Enter The ID to search a Employee: ");
								String empId3 = sc.next();
								
								Employee e3 = f.searchEmployee(empId3);
								
								if(e3 != null)
								{
									System.out.println();
									System.out.println("*** Employee Found ***");
									e3.showDetails();
									System.out.println();
								}
								else
								{
									System.out.println();
									System.out.println("*** Employee NOT Found ***");
									System.out.println();
								}

								break;
								
							case 4:
								
								System.out.println("************************************");
								System.out.println("You Have Selected Show All Employees");
								System.out.println("************************************");
								System.out.println();

								f.showAllEmployees();

								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat1 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 2:
					
					System.out.println("#####################################");
					System.out.println("You Have Selected Buyer Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat2 = true;
					
					while(repeat2)
					{
					
						System.out.println("\tBuyer Management Options are: \n");
						System.out.println("\t\t1. Insert New Buyer");
						System.out.println("\t\t2. Remove Buyer");
						System.out.println("\t\t3. Search Buyer");
						System.out.println("\t\t4. Show All Buyer");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option2 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option2)
						{
							case 1:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Insert Buyer");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter Buyer NID: ");
								int nid1 = sc.nextInt();
								System.out.print("Enter Buyer Name: ");
								String name1 = sc.next();
								System.out.print("Enter Phone Number: ");
								String phnNumber1 = sc.next();
								
								Buyer c1 = new Buyer();
								c1.setNid(nid1);
								c1.setName(name1);
								c1.setPhnNumber(phnNumber1);
								
								if(f.insertBuyer(c1))
								{
									System.out.println();
									System.out.println(nid1 + " Buyer Has Been Inserted");
									System.out.println();
								}
								else
								{
									System.out.println();
									System.out.println(nid1 + " Buyer Can NOT be Inserted");
									System.out.println();
								}
							
								break;
								
							case 2:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Remove Buyer");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The NID to remove a Buyer: ");
								int nid2 = sc.nextInt();
								
								Buyer c2 = f.searchBuyer(nid2);
								
								if(c2 != null)
								{
									if(f.removeBuyer(c2))
									{
										System.out.println();
										System.out.println("*** Buyer Removed ***");
										System.out.println();
									}
								}
								else
								{
									System.out.println();
									System.out.println("*** Buyer Can NOT be Removed ***");
									System.out.println();
								}
								
								break;
								
							case 3:
							
								System.out.println("*********************************");
								System.out.println("You Have Selected Search Buyer");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The NID to search a Buyer: ");
								int nid3 = sc.nextInt();
								
								Buyer c3 = f.searchBuyer(nid3);
								
								if(c3 != null)
								{
									System.out.println();
									System.out.println("*** Buyer Found ***");
									c3.showDetails();
									System.out.println();
								}
								else
								{
									System.out.println();
									System.out.println("*** Buyer NOT Found ***");
									System.out.println();
								}
								
								break;
								
							case 4:
								
								System.out.println("************************************");
								System.out.println("You Have Selected Show All Buyer");
								System.out.println("************************************");
								System.out.println();
								
								f.showAllBuyers();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat2 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 3:
				
					System.out.println("#####################################");
					System.out.println("You Have Selected Account Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat3 = true;
					
					while(repeat3)
					{
					
						System.out.println("\tProduct Management Options are: \n");
						System.out.println("\t\t1. Insert New Product");
						System.out.println("\t\t2. Remove Product");
						System.out.println("\t\t3. Search Product");
						System.out.println("\t\t4. Show All Products");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option3 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option3)
						{
							case 1:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Insert New Product");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Buyer NID for Verification: ");
								int nid1 = sc.nextInt();
								
								Buyer c1 = f.searchBuyer(nid1);
								
								if(c1 != null)
								{
									System.out.println();
									System.out.println("**** Valid Buyer ****");
									System.out.println();
									
									System.out.println("Which Type of Product do you want ?");
									System.out.println("\t\t 1. Costly Product");
									System.out.println("\t\t 2. Cheap Product");
									System.out.println("\t\t 3. Go Back");
									
									System.out.println("\n---------------------------");
									System.out.print("Enter Your Type: ");
									int type = sc.nextInt();
									System.out.println("---------------------------\n");
									
									Product a1 = null;
									
									if(type == 1)
									{
										System.out.println("***************");
										System.out.println("Costly Product");
										System.out.println("***************");
										System.out.println();
										
										System.out.print("Enter Product Name: ");
										String an = sc.next();
										System.out.print("Enter Total Product: ");
										int ba = sc.nextInt();
										System.out.print("Enter Price: ");
										int ir = sc.nextInt();
										
										CostlyProduct sa = new CostlyProduct(an, c1, ba, ir);
										
										a1 = sa;
										
									}
									else if(type == 2)
									{
										System.out.println("***************");
										System.out.println("Cheap Product");
										System.out.println("***************");
										System.out.println();
										
										System.out.print("Enter Product Name: ");
										String an = sc.next();
										System.out.print("Enter Total Product: ");
										int ba = sc.nextInt();
										System.out.print("Enter Product Size: ");
										int ty = sc.nextInt();
										
										CheapProduct fa = new CheapProduct(an, c1, ba, ty);
										
										a1 = fa;
									}
									else if(type == 3)
									{
										System.out.println("***************");
										System.out.println("Going Back");
										System.out.println("***************");
										System.out.println();
									}
									else
									{
										System.out.println("***************");
										System.out.println("Invalid Type");
										System.out.println("***************");
										System.out.println();
									}
									
									if(a1 != null)
									{
										if(f.insertProduct(a1))
										{
											System.out.println();
											System.out.println("*** Product Inserted ***");
											System.out.println();
										}
										else
										{
											System.out.println();
											System.out.println("*** Product NOT Inserted ***");
											System.out.println();
										}
									}
									
								}
								else
								{
									System.out.println();
									System.out.println("**** Invalid Buyer ****");
									System.out.println();
								}
								
								break;
								
							case 2:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Remove Product");
								System.out.println("********************************");
								System.out.println();

								System.out.print("Enter The Product Name to remove Product: ");
								String productName1 = sc.next();
								
								Product a2 = f.searchProduct(productName1);
								
								if(a2 != null)
								{
									if(f.removeProduct(a2))
									{
										System.out.println();
										System.out.println("*** Product Removed ***");
										System.out.println();
									}
								}
								else
								{
									System.out.println();
									System.out.println("*** Product Can NOT be Removed ***");
									System.out.println();
								}

								break;
								
							case 3:
							
								System.out.println("********************************");
								System.out.println("You Have Selected Search Product");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Product Name to search Product: ");
								String productName2 = sc.next();
								
								Product a3 = f.searchProduct(productName2);
								
								if(a3 != null)
								{
									System.out.println();
									System.out.println("*** Product Found ***");
									a3.showDetails();
									System.out.println();
								}
								else
								{
									System.out.println();
									System.out.println("*** Product NOT Found ***");
									System.out.println();
								}

								break;
								
							case 4:
								
								System.out.println("***********************************");
								System.out.println("You Have Selected Show All Products");
								System.out.println("***********************************");
								System.out.println();
								
								f.showAllProducts();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat3 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
				
					break;
					
				case 4:
					
					System.out.println("######################################");
					System.out.println("You Have Selected Product Count");
					System.out.println("######################################");
					System.out.println();
					
					boolean repeat4 = true;
					
					while(repeat4)
					{
					
						System.out.println("\tProduct Count Options are: \n");
						System.out.println("\t\t1. Added Product");
						System.out.println("\t\t2. Solded Product");
						System.out.println("\t\t3. Show All Products");
						System.out.println("\t\t4. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option4 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option4)
						{
							case 1:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Added Product");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Product Name: ");
								String an1 = sc.next();
								
								Product a1 = f.searchProduct(an1);
								
								if(a1 != null)
								{
									System.out.println("*** Valid Product ***");
									
									System.out.println("Current Total Product : " + a1.getTotalProduct());
									System.out.print("Added Product: ");
									int am = sc.nextInt();
									
									if(a1.addProduct(am))
									{
										System.out.println("--- Added Successfull ---");
										System.out.println("New Total Product	: " + a1.getTotalProduct());
										frwd.writeInFile(am + " Added in " + a1.getProductName());
									}
									else
									{
										System.out.println();
										System.out.println("--- Added Failed ---");
										System.out.println();
									}
								}
								
								break;
								
							case 2:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Solded Product");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Product Name: ");
								String an2 = sc.next();
								
								Product a2 = f.searchProduct(an2);
								
								if(a2 != null)
								{
									System.out.println("*** Valid Product ***");
									
									System.out.println("Current Total Product : " + a2.getTotalProduct());
									System.out.print("Solded Product : ");
									int am = sc.nextInt();
									if(a2.soldProduct(am))
									{
										System.out.println("--- Sold Successfull ---");
										System.out.println("New Total Product : " + a2.getTotalProduct());
										frwd.writeInFile(am + " Solded " + a2.getProductName());
									}
									else
									{
										System.out.println();
										System.out.println("--- Sold Failed ---");
										System.out.println();
									}
								}
								
								break;
								
							case 3:
							
								System.out.println("*************************************");
								System.out.println("You Have Selected Product Add & Sold History");
								System.out.println("*************************************");
								System.out.println();
								
								frwd.readFromFile();
								
								break;
								
							case 4:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								System.out.println();
								repeat4 = false;
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 5:
					
					System.out.println("##################################");
					System.out.println("You Have Selected Factory Information");
					System.out.println("##################################");
					System.out.println();
					
					f.showDetails();
					
					break;
					
				case 6:
					
					System.out.println("###################################");
					System.out.println("Thank You for Using Our Application");
					System.out.println("###################################");
					System.out.println();
					
					repeat = false;
					
					break;
					
				default:
				
					System.out.println("######################");
					System.out.println("Invalid Selection.....");
					System.out.println("######################");
					System.out.println();
					
					break;
			}
		}		
	}
}