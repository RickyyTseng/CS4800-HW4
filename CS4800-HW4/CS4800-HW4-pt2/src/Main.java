import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MealFactory mealFactory = MealFactory.getInstance();

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ricky", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "No Restriction"));
        customers.add(new Customer("Cameron", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Paleo"));
        customers.add(new Customer("Angeline", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Vegan"));
        customers.add(new Customer("Tannar", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Nut Allergy"));
        customers.add(new Customer("Christian", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "No Restriction"));
        customers.add(new Customer("Hailey", mealFactory::createCarb, mealFactory::createProtein, mealFactory::createFat, "Vegan"));

        for (Customer customer : customers) {
            customer.generateMeal();
        }
    }
}