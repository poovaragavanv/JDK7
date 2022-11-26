
public class ChainingException {
	static void exdemo() {
        NullPointerException e = new NullPointerException("Top Layer");
        e.initCause(new ArithmeticException("Underlying Cause"));
        throw e;
    }
 
    public static void main(String args[]) {
        try {
            exdemo();
        } catch (NullPointerException n) {
            System.out.println("Exception caught:" + n);
            System.out.println("Original cause of exception:" + n.getCause());
        }
    }
}
