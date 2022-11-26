/* Our SerializationUtility class has two methods
 * serialize() : we will make use of java.util.ObjectOutput stream to write the Object which we pass, to the file “Persist.txt”
 * deSerialize(): java.util.ObjectInputStream is used to read the Object from the file and return it back to the user.
 */
package transientExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtility
{
    //Method to serialize and save the object in the file
    public void serialize(Object obj,String filePath)
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(obj);
            outputStream.flush();
            outputStream.close();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
    
    //Method to de serialize and return the object
    public Object deSerialize(String filePath)
    {
        Object obj = null;
        try
        {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            obj = inputStream.readObject();
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        return obj;
    }
}