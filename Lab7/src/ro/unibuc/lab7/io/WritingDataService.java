package ro.unibuc.lab7.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WritingDataService {

    public static void writeUsingFileOutputStream(String text) {
        try (FileOutputStream out = new FileOutputStream("output1.txt")) {
            out.write(text.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeUsingFileWriter(String text) {
        try (FileWriter out = new FileWriter("output2.txt")) {
            out.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeUsingDataOutputStream(String text) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("output3.txt"))){
            out.writeBytes(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeUsingBufferedOutputStream(String text) {
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("output4.txt"))){
            bufferedOutputStream.write(text.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * BufferedWriter class is used to provide buffering for Writer instances. It makes the performance
     * fast. It inherits Writer class. The buffering characters are used for providing the efficient writing
     * of single arrays, characters, and strings.
     */
    public static void writeUsingBufferedWriter(String text) {
        try(BufferedWriter out = new BufferedWriter(new FileWriter("output5.txt"))){
            out.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeWithRandomAccessFile(String text) {
        try(RandomAccessFile out = new RandomAccessFile("output6.txt", "rw")){
            out.writeBytes(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
