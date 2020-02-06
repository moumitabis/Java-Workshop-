package abstraction;

public class CheckAbstraction extends AbstractDemo implements InterfaceDemo {
    @Override
    void showData() {
        System.out.println("Inside show data");

    }
    public static void main(String[] args) {
        CheckAbstraction abstraction=new CheckAbstraction();
        abstraction.showData();
    }
    public void add() {

    }
}
