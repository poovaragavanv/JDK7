package settterandgettermethods;

public class SetandGet 
{
	 private String name;
	 private int id;	 
	 public String getName() 
	 {
		 return name;	
	 }
	 public void setName(String name) 
	 {		 
	 this.name = name;
	 }
	 public int getId() 
	 {
		 return id;		 
	 }
	 public void setId(int id) 
	 {
		 this.id = id;		 
	 }
	 	public static void main(String args[])
	 	{
	 		SetandGet obj = new SetandGet();
	 		obj.setId(1);
	 		obj.setName("RAGAVAN");
	 		System.out.println(obj.getId());
	 		System.out.println(obj.getName());
	 		 /* obj.name="setting some value";
	 		 * obj.id=1;
	 		 * System.out.println(obj.name);
	 		 * System.out.println(obj.id);
	 		 */
	 	}
}

