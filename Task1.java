import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        firstExсeption();
        secondException();
        thirdException();
    }
     static void firstExсeption(){
        Integer max = Integer.MAX_VALUE;
        Integer reslut;
        try {
            reslut = max / 0;
            System.out.println(reslut);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

    }
     static void secondException(){
        String filePath = "./somefile.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
    static void thirdException(){
        try {
            String a1 = null;
            System.out.println(a1.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointer is found in the program.");
        }
    }
}
