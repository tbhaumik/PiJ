package examples;


public class GoesWrong {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (Exception ex) {
            System.err.println("Ouch");
            throw new RuntimeException();
        } finally {
            System.err.println("Something else");
        }
    }
}
