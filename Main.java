import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberProcessor {
    private String fileName;

    public NumberProcessor(String fileName) {
        this.fileName = fileName;
    }

    public int findMin() throws IOException {
        int min = Integer.MAX_VALUE;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] numbers = line.split(" ");
            for (String num : numbers) {
                int n = Integer.parseInt(num);
                if (n < min) {
                    min = n;
                }
            }
        }
        return min;
    }

    public int findMax() throws IOException {
        int max = Integer.MIN_VALUE;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] numbers = line.split(" ");
            for (String num : numbers) {
                int n = Integer.parseInt(num);
                if (n > max) {
                    max = n;
                }
            }
        }
        return max;
    }

    public int sum() throws IOException {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] numbers = line.split(" ");
            for (String num : numbers) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }

    public long mult() throws IOException {
        long mult = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] numbers = line.split(" ");
            for (String num : numbers) {
                mult *= Integer.parseInt(num);
            }
        }
        return mult;
    }
}