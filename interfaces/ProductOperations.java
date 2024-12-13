package interfaces;
import java.lang.*;
import classes.Product;

public interface ProductOperations
{
	boolean insertProduct(Product a);
	boolean removeProduct(Product a);
	Product searchProduct(String productName);
	void showAllProducts();
}