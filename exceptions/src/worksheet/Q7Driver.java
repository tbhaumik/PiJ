package worksheet;

public class Q7Driver {
    public static void main(String[] args) {
         launch();
    }

    public static void launch(){
        try {
            ((A)new C()).meth();
        } catch (BaseException e) {
            e.printStackTrace();
        }
    }
}
