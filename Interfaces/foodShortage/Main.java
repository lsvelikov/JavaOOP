package OOP.Interfaces.foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerMap = new HashMap<>();
        Buyer buyer;
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            if (input.length == 4) {
                String id = input[2];
                String birthDate = input[3];
                buyer = new Citizen(name, age, id, birthDate);
            } else {
                String group = input[2];
                buyer = new Rebel(name, age, group);
            }
            buyerMap.put(name, buyer);
        }
        String command = scanner.nextLine();
        while (!"End".equals(command)){
            String name = command;
            if (buyerMap.containsKey(name)) {
                buyerMap.get(name).buyFood();
            }
            command = scanner.nextLine();
        }
        System.out.println(buyerMap.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
