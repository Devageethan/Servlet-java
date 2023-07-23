package billing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dish spaghetti = new Dish("Spaghetti", "Pasta with tomato sauce", 10.99);
        Dish salad = new Dish("Salad", "Mixed greens with dressing", 5.99);
        Dish burger = new Dish("Burger", "Beef patty with cheese and toppings", 8.99);

        Bill bill = new Bill();
        Scanner scanner = new Scanner(System.in);

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new File("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (true) {
            // Print menu
            writer.println("Menu:");
            writer.println("1. Spaghetti ($10.99)");
            writer.println("2. Salad ($5.99)");
            writer.println("3. Burger ($8.99)");
            writer.println("4. Add dish to bill");
            writer.println("5. Remove dish from bill");
            writer.println("6. Calculate total");
            writer.println("7. Exit");

            // Get user input
            writer.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bill.addDish(spaghetti);
                    writer.println("Spaghetti added to bill");
                    writer.flush();
                    break;
                case 2:
                    bill.addDish(salad);
                    writer.println("Salad added to bill");
                    writer.flush();
                    break;
                case 3:
                    bill.addDish(burger);
                    writer.println("Burger added to bill");
                    writer.flush();
                    break;
                case 4:
                    System.out.print("Enter dish name: ");
                    String dishName = scanner.next();
                    System.out.print("Enter dish description: ");
                    String dishDescription = scanner.next();
                    System.out.print("Enter dish price: ");
                    double dishPrice = scanner.nextDouble();
                    Dish newDish = new Dish(dishName, dishDescription, dishPrice);
                    bill.addDish(newDish);
                    writer.println(newDish.getName() + " added to bill");
                    writer.flush();
                    break;
                case 5:
                    System.out.print("Enter dish name to remove: ");
                    String dishToRemove = scanner.next();
                    boolean removed = bill.removeDish(dishToRemove);
                    if (removed) {
                        writer.println(dishToRemove + " removed from bill");
                        writer.flush();
                    } else {
                        writer.println(dishToRemove + " not found in bill");
                        writer.flush();
                    }
                    break;
                case 6:
                    writer.println("Subtotal: " + bill.getSubtotal());
                    writer.println("Total: " + bill.getTotal());
                    writer.flush();
                    break;
                case 7:
                    writer.println("Exiting...");
                    scanner.close();
                    writer.close();
                    System.exit(0);
                default:
                    writer.println("Invalid choice");
                    writer.flush();
            }
        }
    }
}
