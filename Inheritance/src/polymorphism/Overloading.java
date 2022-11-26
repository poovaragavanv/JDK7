// Static Polymorphism is in other words termed as compile time binding or early binding.
// Variations in Overloading a Method = > Number of parameters passed,Data type of actual parameters, Sequence of data type of actual parameters

package polymorphism;

class Multiply 
{
	void mul(int a, int b)
	{
		System.out.println("Sum of two=" + (a * b));
	}
	void mul(int a, int b, int c) 
	{
	  System.out.println("Sum of three=" + (a * b * c));
	 }
}
class Overloading 
{
		public static void main(String args[]) 
		{
			Multiply m = new Multiply();
			m.mul(6, 10);
			m.mul(10, 6, 5);
		}
}