import java.lang.Throwable;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		try 

		{
			System.out.println("Enter the First Input");
		int a = scan.nextInt(); //
		System.out.println("Enter the Second Input");
		int b = scan.nextInt();
		int c = a / b;
		System.out.println("Enter the thirs Input " + c);
		}
		catch(Exception e)
		{
		//System.out.print(e);
		e.printStackTrace();
		}
		}
	}

