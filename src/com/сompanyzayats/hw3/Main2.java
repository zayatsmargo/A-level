package hw3;

public class Main2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1000; i <= 999999; i++) {
            int firstSum = 0;
            int secondSum = 0;
            int number = i;
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    firstSum += number % 10;
                } else {
                    secondSum += number % 10;
                }
                number /= 10;
            }
            if (firstSum == secondSum) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
