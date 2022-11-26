package ComparingObjects;

public class DestroyingObjects {

	public static void main(String argso[]) {
		int big_array[] = new int[100000];

		// Do some computations with big_array and get a result. 
		//int result = compute(big_array);

		// We no longer need big_array. It will get garbage collected when there
		// are no more references to it. Since big_array is a local variable,
		// it refers to the array until this method returns. But this method
		// doesn't return. So we've got to explicitly get rid of the reference
		// ourselves, so the garbage collector knows it can reclaim the array. 
		big_array = null;

		// Loop forever, handling the user's input
		//for(;;) handle_input(result);
		}
}
