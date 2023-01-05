import java.util.Scanner;
public class pos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choose, total , cash ,change ,quantity = 0, price =0;
		
		
		
		System.out.println("====== WELCOME TO MY SHOP =======");
		System.out.println("[1] Lollipop - 20php");
		System.out.println("[2] Ice Cream - 2php");
		System.out.println("[3] Coke - 3php");
		System.out.println("==================================");
		System.out.print("Choose your order: ");
		choose = scan.nextInt();
		System.out.print("Enter quantity: ");
		quantity = scan.nextInt();
		
		if(choose == 1) {
			price += 20;
			total = price * quantity;
			System.out.println("Item: Lollipop");
			System.out.println("Price: " + price);
			System.out.println("Quantity: " +  quantity);
			System.out.println("Total: "+ total); 	
			System.out.print("Enter cash: ");
			
			cash = scan.nextInt();
			if(cash < total) {
				System.out.println("Insufficient Cash");
				System.exit(0);
			}
			else {
			change = cash - total;
			System.out.println("Your change: "+ change);
			System.out.println("Thank you for shopping!");
			}
		}
		else if(choose == 2) {
			price += 2;
			total = price * quantity;
			System.out.println("Item: Ice Cream");
			System.out.println("Price: " + price);
			System.out.println("Quantity: " +  quantity);
			System.out.println("Total: "+ total); 	
			System.out.print("Enter cash: ");
			cash = scan.nextInt();
			if(cash < total) {
				System.out.println("Insufficient Cash");
				System.exit(0);
			}
			else {
			change = cash - total;
			System.out.println("Your change: "+ change);
			System.out.println("Thank you for shopping!");
			}
			
	
		}
		else if(choose == 3) {
			price += 3;
			total = price * quantity;
			System.out.println("Item: Coke");
			System.out.println("Price: " + price);
			System.out.println("Quantity: " +  quantity);
			System.out.println("Total: "+ total); 	
			System.out.print("Enter cash: ");
			cash = scan.nextInt();
			if(cash < total) {
				System.out.println("Insufficient Cash");
				System.exit(0);
			}
			else {
			change = cash - total;
			System.out.println("Your change: "+ change);
			System.out.println("Thank you for shopping!");
			}
	
		}
		else {System.exit(0);}
		
		
		
		
	}

}
