package a.array_calculator;

public class ArrayCalculator {
    public void calculateArrayStatistics(int[] numbers) {
        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            sum += number;
            max = Math.max(max, number);
            min = Math.min(min, number);
        }

        double average = sum / numbers.length;
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
