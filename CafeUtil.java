import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    TestCafe appCafe = new TestCafe();

    public int getStreakGoal() {
        int sum = 0;
        for(int week =1; week <= 10; week++) {
            sum+=week;

            }
            return sum;
            
        }
        


    public double getOrderTotal(double[] lineItems) {
        int sum = 0;
        for(double price: lineItems) {
            sum+=price;
        }
        return sum;
    }
        

    public void displayMenu(ArrayList<String> menuItems) {
        for(int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }


    public void addCustomer(ArrayList<String> customers) {
        
        System.out.printf("%s", "Please Enter Your Name: ");
        String userName = System.console().readLine();
        
        System.out.printf("%s", "Hello " +  userName );
        System.out.printf("  There are %s people in front of you. \n" , customers.size());
        customers.add(userName);
        System.out.println(customers);

    }
    

    // public void printPriceChart(String product, double price, int maxQuantity) {
    //     double price = 0;


    }



    
}
