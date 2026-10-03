import java.util.Scanner;
public class household {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of members in the family:");
        int number=sc.nextInt();
        System.out.println("Enter the water consumed:");
        int water=sc.nextInt();
        System.out.println("Enter the house number:");
        int house=sc.nextInt();
        System.out.println("Enter the water usage status:");
        char status=sc.next().charAt(0);
        System.out.println("Total number of members in the family:"+number);
        System.out.println("Total water consumed:"+water);
        System.out.println("House number:"+house);
        System.out.println("Water usage status:"+status);             




    }
}
