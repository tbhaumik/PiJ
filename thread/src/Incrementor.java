import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Incrementor extends RecursiveTask<Integer> {
    public static ForkJoinPool fjPool = new ForkJoinPool();
    int theNumber;

    public Incrementor(int x){
        theNumber = x;
        System.err.println("Creating Incrementor...");
    }

    @Override
    protected Integer compute() {
        System.err.println("doing some work...");
        return theNumber +1;
    }

    public static void main(String[] args) {
        System.err.println("Here we go...");
        int result = fjPool.invoke(new Incrementor(42));
        System.err.println(result);
    }
}
