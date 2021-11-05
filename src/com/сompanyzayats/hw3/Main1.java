package hw3;

import java.util.Scanner;

public class Main1 {

        public static void main(String[] args) {
            double x;
            double y;
            double z;
            char op;
            Scanner reader = new Scanner(System.in);
            while(true) {
                System.out.print("\nEnter an operator (+, -, *, /): ");
                op = reader.next().charAt(0);
                switch (op) {
                    case '0':
                        return;
                    case '+':
                        System.out.print("Enter two numbers: ");
                        x = reader.nextDouble();
                        y = reader.nextDouble();
                        z = x + y;
                        break;
                    case '-':
                        System.out.print("Enter two numbers: ");
                        x = reader.nextDouble();
                        y = reader.nextDouble();
                        z = x - y;
                        break;
                    case '*':
                        System.out.print("Enter two numbers: ");
                        x = reader.nextDouble();
                        y = reader.nextDouble();
                        z = x * y;
                        break;
                    case '/':
                        System.out.print("Enter two numbers: ");
                        x = reader.nextDouble();
                        y = reader.nextDouble();
                        z = x / y;
                        break;
                    default:
                        System.out.println("Error! Enter correct operator");
                        return;
                }
                System.out.println("\nThe result is given as follows:\n");
                System.out.println(x + " " + op + " " + y + " = " + z);
            }
        }
}
