package OOP.Encapsulation.pizzaCalories;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);
        Pizza pizza;

        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        String[] doughInfo = scanner.nextLine().split("\\s+");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double weight = Integer.parseInt(doughInfo[3]);

        try {
            Dough dough = new Dough(flourType, bakingTechnique, weight);
            pizza.setDough(dough);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        String input = scanner.nextLine();

        while (!"END".equals(input)){
            String[] toppingInfo = input.split("\\s+");
            String toppingType = toppingInfo[1];
            double toppingWeight = Integer.parseInt(toppingInfo[2]);

            try {
                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);
                numberOfToppings--;
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
                return;
            }
            if (numberOfToppings > 0){
                input = scanner.nextLine();
            } else {
                break;
            }
        }
        System.out.printf("%s - %.2f", pizzaName, pizza.getOverallCalories());
    }
}
