package learning;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
// Inputs 
		System.out.println("Choose from the folloeing options");
		System.out.println("1) USD to JMD");
		System.out.println("2) JMD to USD");
		System.out.println("3) £ to USD");
		int exchange = sc.nextInt();
		switch (exchange) {
		case 1: {
			 System.out.println("Enter the number of USD");
			 
			 double usd = sc.nextDouble();
			 
			 if (usd>=0) {
				 System.out.println(usd + " USD is " + usd*155.14 + "JMD");
				 
			 }
			 else {
				 System.out.println("Please pur in positive numbers of USD");
			 }
		}
		break;
		case 2: {
			System.out.println("Enter the number of JMD");
			double JMD = sc.nextDouble();
			
			if (JMD>=0) {
				System.out.println(JMD + "JMD is " + JMD*0.0064 + "USD");
			}
			else {
				System.out.println("Please put in positive numbers of JMD ");
			}
		}
		break;
		case 3: {
			 System.out.println("Enter the number of £ ");
			 double pounds = sc.nextDouble();
			 
			 if (pounds>=0) {
				 System.out.println(pounds + "£ is " + pounds*1.27 + "USD");
			 }
			 else {
				 System.out.println("Please put in positive number of £");
			 }
		}
		break;
		}
		sc.close();
		
		
	
	}

}
