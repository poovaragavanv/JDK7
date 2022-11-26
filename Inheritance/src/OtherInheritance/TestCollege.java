package OtherInheritance;

/**
 * This class is used to test the custom marker interface functionality.
 * @author Rags
 */
public class TestCollege 
{
	static void tester(Object obj)
	{
		if (obj instanceof AGradeCollegeMarker) 
		{
            System.out.println("A grade college.");
        }
	}
public static void main(String args[]){
		College1 obj1 = new College1();
		College2 obj2 = new College2();
		//test college objects
		tester(obj1);
		tester(obj2);
	}
}
