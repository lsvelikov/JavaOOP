package OOP.Interfaces.birthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthdayList = new ArrayList<>();
        while (!"End".equals(input)) {

            String[] inputData = input.split("\\s+");
            String type = inputData[0];
            String name = inputData[1];
            Birthable birthable;

            switch (type) {
                case "Citizen":
                    int age = Integer.parseInt(inputData[2]);
                    String id = inputData[3];
                    String birthDate = inputData[4];
                    birthable = new Citizen(name, age, id, birthDate);
                    birthdayList.add(birthable);
                    break;
                case "Pet":
                    String birthDatePet = inputData[2];
                    birthable = new Pet(name, birthDatePet);
                    birthdayList.add(birthable);
                    break;
            }

            input = scanner.nextLine();
        }
        String yearOfBirth = scanner.nextLine();
        boolean isFound = false;

        for (Birthable birthable : birthdayList) {
            if (birthable.getBirthDate().endsWith(yearOfBirth)) {
                isFound = true;
                System.out.println(birthable.getBirthDate());
            }
        }
        if (!isFound) {
            System.out.println("<no output>");
        }
    }
}
