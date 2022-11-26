package workout.io.basic;

import java.io.*;

public class DataOutputStreamExample {
 
    static final double[] price = { 15.43, 10.12, 50.8, 249.56, 18.99 };
    static final int[] qty = { 10, 23, 45, 14, 2 };
    static final String[] items = { "keyboard", "mouse", "core java ebook",
            "ups", "pen drive", };
 
    public static void main(String[] args) {
 
        /**
         * Use try with resources or don't forget to close the stream( because
         * we use BufferedStream here).
         */
        try (
                // Create File output Stream. data.txt should be in classpath or provide fully qualified path
                OutputStream os = new FileOutputStream("E:\\JAVA\\IOStreams\\src\\workout\\io\\basic\\data.txt");
                 
                // Create Buffered stream. You can skip this step also
                BufferedOutputStream bos = new BufferedOutputStream(os);
                 
                // create data output stream
                DataOutputStream out = new DataOutputStream(bos)
            ) {
             
            // stuffing item name, quantity, price one by one in output stream
            for (int i = 0; i < price.length; i++) {
                out.writeUTF(items[i]);
                out.writeInt(qty[i]);
                out.writeDouble(price[i]);
            }
             
            System.out.println("Data successfully written to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}