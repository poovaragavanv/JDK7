
public class Shadowing {

    public int x = 0;

    class FirstLevel {
    	/* same name as another declaration in the enclosing scope, 
    	then the declaration shadows the declaration of the enclosing scope
    	*/
        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Shadowing.this.x = " + Shadowing.this.x);
        }
    }

    public static void main(String[] args) {
    	//You cannot refer to a shadowed declaration by its name alone
        Shadowing st = new Shadowing();
        Shadowing.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}