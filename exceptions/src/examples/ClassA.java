package examples;

public class ClassA {
    private int item;

    public ClassA(int item) {
        this.item = item;
    }

    private void foo() {
        System.err.println("I'm here!!!!");
    }

    public int method(int value) { //throws ArrayIndexOutOfBoundsException {
        try {
            return item / value;
        }
        finally {
//            try {
//               System.err.println("Exiting from ClassA::method");
//            } catch (Exception r){
//                System.err.println("RTE");
//            }
//            this.foo();
//            throw new Exception("OMG");
//            //return 4;
            System.err.println("Exiting from ClassA::method");
        }
//        return 10;
    }

}
