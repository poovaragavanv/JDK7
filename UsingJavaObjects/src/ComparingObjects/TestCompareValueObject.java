package ComparingObjects;

public class TestCompareValueObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyValueObject obj1 = new MyValueObject("POOVA", "RAGAVAN");
        MyValueObject obj2 = new MyValueObject("POOVA", "RAGAVAN");

        if (obj1.equals(obj2))
        {
            System.out.println("Both the objects are equal");
        }
        else
        {
            System.out.println("Both the objects are not equal");
        }

	}

}
