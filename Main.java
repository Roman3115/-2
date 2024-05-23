package NumberProcessor;
import NumberProcessor.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            NumberProcessor test1 = new NumberProcessor("file1.txt");
            int min = test1.findMin();
            int max = test1.findMax();
            int sum = test1.sum();
            double mult = test1.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test1 = new NumberProcessor("file2.txt");
            int min = test1.findMin();
            int max = test1.findMax();
            int sum = test1.sum();
            double mult = test1.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test1 = new NumberProcessor("file3.txt");
            int min = test1.findMin();
            int max = test1.findMax();
            int sum = test1.sum();
            double mult = test1.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test1 = new NumberProcessor("file4.txt");
            int min = test1.findMin();
            int max = test1.findMax();
            int sum = test1.sum();
            double mult = test1.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test1 = new NumberProcessor("file5.txt");
            int min = test1.findMin();
            int max = test1.findMax();
            int sum = test1.sum();
            double mult = test1.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
