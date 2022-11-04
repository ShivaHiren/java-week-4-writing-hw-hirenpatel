import java.util.Scanner;

public class Programme_15_LeftTriangleStar {
/*Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
 */
public static void leftTraingle(int x){
    int i, j;
    for (i = 1; i<=x; i++){
        for (j = 1; j <=i; j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a = scanner.nextInt();
        leftTraingle(a);
        //closing the scanner object
        scanner.close();
    }

}
