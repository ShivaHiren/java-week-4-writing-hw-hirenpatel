package programme_21_abstractexample;
//Create the fourht calss name TestAbstraction and inside create the main method as below
// in real scenario, method is called bt programmer or user

public class TestAbstraction {
    public static void main(String[] args) {
        //In a real scenario, object is provided through methid, e.g., getShape()method
        Shape s = new Circle();
        s.draw();
    }
}
