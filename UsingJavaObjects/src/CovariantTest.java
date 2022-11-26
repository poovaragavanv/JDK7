// Co-variant return type is based on Liskov substitution principle.

class Staff 
{
	public Staff getInstance() 
	{
		return this;
	}
}
class Faculty extends Staff 
{
	// Covariant return type in action!!!
	//Notice the covariant return type getInstance here, which is subtype of Faculty
	public Faculty getInstance() 
	{
		return this;
	}
/*
 * overriding method (in subclass) can have a return type,
 * that is subtype of overridden method return type (in superclass).
 */
	
	public void doExtraWork() 
	{
		System.out.println("Faculty do extra work ...");
	}
}
public class CovariantTest 
{
		public static void main(String... args) 
		{
		new Faculty().getInstance().doExtraWork();
		}
}


/*
Advantages:

It helps to avoid confusing type casts present in the class hierarchy and thus making the code readable, usable and maintainable.
We get a liberty to have more specific return types when overriding methods.
Help in preventing run-time ClassCastExceptions on returns

*/