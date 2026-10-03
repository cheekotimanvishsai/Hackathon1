import java.util.Scanner;
public class waterbill {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water consumed in liters:");
        int waterConsumed = sc.nextInt();
        if(waterConsumed <= 500){
            System.out.println("water bill is 100");

        }
        else{
            System.out.println("water bill is 200");
        }
    }

}
