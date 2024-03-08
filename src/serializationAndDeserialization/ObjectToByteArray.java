package serializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Sample implements Serializable {
    public void display() {
        System.out.println("This is a sample class");
    }
}
public class ObjectToByteArray {
    public static void main(String args[]) throws Exception {
        Sample obj = new Sample();
        FileOutputStream fos = new FileOutputStream("input.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.flush();
        oos.close();
        fos.close();
    }
}