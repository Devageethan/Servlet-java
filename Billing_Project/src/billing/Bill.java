package billing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Dish> dishes;
    private double subtotal;
    private double tax;
    private double total;
    
    public Bill() {
        dishes = new ArrayList<>();
        subtotal = 0;
        tax = 0;
        total = 0;
    }
    
    public void addDish(Dish dish) {
        dishes.add(dish);
        subtotal += dish.getPrice();
    }
    
    public boolean removeDish(Dish dish) {
        dishes.remove(dish);
        subtotal -= dish.getPrice();
		return false;
    }
    
    public List<Dish> searchDishes(String keyword) {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                dish.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(dish);
            }
        }
        return result;
    }
    
    public void sortDishes() {
        Collections.sort(dishes, (d1, d2) -> d1.getName().compareTo(d2.getName()));
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
    public double getTax() {
        return tax;
    }
    
    public void setTax(double tax) {
        this.tax = tax;
    }
    
    public double getTotal() {
        total = subtotal + (subtotal * tax);
        return total;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Dish dish : dishes) {
            sb.append(dish.toString()).append("\n");
        }
        sb.append(subtotal).append(",").append(tax).append(",").append(total);
        return sb.toString();
    }
    
    public void saveToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
        }
    }
    
    public static Bill loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Bill) ois.readObject();
        }
    }

	public boolean removeDish(String dishToRemove) {
		// TODO Auto-generated method stub
		return false;
	}
}


