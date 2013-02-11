package examples;

public class ClassB extends ClassA {

    public ClassB(int item){
        super(item);
    }

    public int method(int value) {
        try {
            return super.method(value);
        }
        finally {
            System.err.println("Exiting from ClassB::method");
        }
    }
}
