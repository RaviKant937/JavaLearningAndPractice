package play_with_exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TryWithResources {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/ravi/Desktop/IdeaProjects/LearningJava/src/play_with_exceptions/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/ravi/Desktop/IdeaProjects/LearningJava/src/play_with_exceptions/output.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

        }
        try (MyResource resource = new MyResource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println(e.getSuppressed().getClass());
            System.out.println("Caught exception: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + suppressed.getMessage());
            }
        }
    }
}

class MyResource implements AutoCloseable {
    int val;
    public void doSomething() throws Exception {
        throw new Exception("Exception during doSomething");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Exception during close");
    }

    public MyResource(){
        val=0;
    }
}
