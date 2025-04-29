package calcс;
import java.util.Scanner;

public class calcc {
    public static void main(String[] args) {
        System.out.println("Input operation: ");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        //Хайдуров Николай Николаевич
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("input first number: ");
        int x = scanner.nextInt();
        System.out.println("input second number: ");
        int y = scanner.nextInt();
        int res = 0;
        if (operation == 1)
            res = x + y;
        else if (operation == 2)
            res = x - y;
        else if (operation == 3)
            res = x * y;
        else if (operation == 4)
            res = x / y;
        System.out.println("result = " + res);
        System.out.println("khaidurov");
    }
}