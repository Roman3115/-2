package NumberProcessor;
import NumberProcessor.*;
import java.io.IOException;
public class Main {  
    public static void main(String[] args) {
        try {
            NumberProcessor test1 = new NumberProcessor("file1.txt");
            long start = System.currentTimeMillis();
            int sum = test1.sum();
            long finish = System.currentTimeMillis();
            long elapsed = (finish - start);
            System.out.println(elapsed);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test2 = new NumberProcessor("file2.txt");
            long start = System.currentTimeMillis();
            int sum = test2.sum();
            long finish = System.currentTimeMillis();
            long elapsed = (finish - start);
            System.out.println(elapsed);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test3 = new NumberProcessor("file3.txt");
            long start = System.currentTimeMillis();
            int sum = test3.sum();
            long finish = System.currentTimeMillis();
            long elapsed = (finish - start);
            System.out.println(elapsed);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test4 = new NumberProcessor("file4.txt");
            long start = System.currentTimeMillis();
            int sum = test4.sum();
            long finish = System.currentTimeMillis();
            long elapsed = (finish - start);
            System.out.println(elapsed);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test5 = new NumberProcessor("file5.txt");
            long start = System.currentTimeMillis();
            int sum = test5.sum();
            long finish = System.currentTimeMillis();
            long elapsed = (finish - start);
            System.out.println(elapsed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
