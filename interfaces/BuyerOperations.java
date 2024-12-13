package interfaces;
import java.lang.*;
import classes.Buyer;

public interface BuyerOperations
{
		boolean insertBuyer(Buyer c);
		boolean removeBuyer(Buyer c);
		Buyer searchBuyer(int nid);
		void showAllBuyers();

}