package ComparingObjects;

public class MyValueObject {
	
	    private String firstName;
	    private String lastName;

	    /**
	     * This constructor is used to set the two properties values in the class.
	     *
	     * @param firstName
	     * @param lastName
	     */
	    public MyValueObject(String firstName,
	                          String lastName)
	    {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    @Override
	    public boolean equals(Object obj)
	    {
	        boolean isEqual = false;
	        if (this.getClass() == obj.getClass())
	        {
	            MyValueObject myValueObject = (MyValueObject) obj;
	            if ((myValueObject.firstName).equals(this.firstName) &&
	                    (myValueObject.lastName).equals(this.lastName))
	            {
	                isEqual = true;
	            }
	        }

	        return isEqual;
	    }
	}

