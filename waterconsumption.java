import java.util.Scanner;
public class waterconsumption {
    static int calculateTotal(int morningUsage,int eveningUsage){
        return morningUsage + eveningUsage;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the morning water usage in liters:");
    int morningUsage=sc.nextInt();
    System.out.println("Enter the evening water usage in liters:");
    int eveningUsage=sc.nextInt();
    int totalUsage=calculateTotal(morningUsage,eveningUsage);
    System.out.println("Total water consumption for the day is: " + totalUsage + " liters");
    sc.close();

    
}
}
