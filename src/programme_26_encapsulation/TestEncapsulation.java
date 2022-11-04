package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //Setting vlaues of the variable
        obj.setName("Amit:");
        obj.setAge(19);
        obj.setRollNo(51);
        //displaying values of variables
        System.out.println("Prime's name :" + obj.getName());
        System.out.println("Prime's age :" + obj.getAge());
        System.out.println("Prime's rollno :" + obj.getRollNo());
        //Diect access of rollno is not possible due to encapulation
        System.out.println("Prime's rollno :" + obj.getName());

    }
}
