import java.util.Random;

public class SumTester {
    private static Random rand = new Random();
    private static final int NUM = 13;

    public static void main(String[] args) {
        int[] array = new int[14999];
        for(int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(NUM);

        System.out.println("The sum is: " + Sum.sumArray(array));

    }
}
