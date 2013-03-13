import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Long> {
    private static final int SEQUENTIAL_THRESHOLD = 5000;

    private int low;
    private int high;
    private int[] array;

    public Sum(int[] array, int low, int high) {
        this.array = array;
        this.low = low;
        this.high = high;
    }

    @Override
    protected Long compute() {
        if (high - low <= SEQUENTIAL_THRESHOLD) { // not much work to do?
            long sum = 0;
            for (int i = low; i < high; i++)
                sum += array[i];
            return sum;
        } else { // split the array into two parts
            int mid = low + (high - low) / 2;
            Sum left = new Sum(array, low, mid);
            Sum right = new Sum(array, mid, high);
            left.fork(); // start another thread to sum the left half
            System.err.println(Thread.currentThread());
            long rightAns = right.compute(); // do the right half myself --- normal call
            long leftAns = left.join(); // when I'm done wait for the other thread
            return leftAns + rightAns;
        }
    }

    // and where it all begins...

    static long sumArray(int[] array) {
        return Globals.fjPool.invoke(new Sum(array,0,array.length));
    }
}
