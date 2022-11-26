package workout.io.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		InputStreamReader ir  = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String name = br.readLine();
		System.out.println("Your name is " + name);
		

	}

}
