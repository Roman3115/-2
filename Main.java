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
            NumberProcessor test2 = new NumberProcessor("file2.txt");
            int min = test2.findMin();
            int max = test2.findMax();
            int sum = test2.sum();
            double mult = test2.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test3 = new NumberProcessor("file3.txt");
            int min = test3.findMin();
            int max = test3.findMax();
            int sum = test3.sum();
            double mult = test3.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test4 = new NumberProcessor("file4.txt");
            int min = test4.findMin();
            int max = test4.findMax();
            int sum = test4.sum();
            double mult = test4.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            NumberProcessor test5 = new NumberProcessor("file5.txt");
            int min = test5.findMin();
            int max = test5.findMax();
            int sum = test5.sum();
            double mult = test5.mult();
            System.out.println(min);
            System.out.println(max);
            System.out.println(sum);
            System.out.println(mult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
