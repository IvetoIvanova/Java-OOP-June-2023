package F04InterfacesAndAbstraction.Exercise.T04FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> rebelsAndCitizen = new HashMap<>();

        while (numOfPeople > 0) {
            String[] rebelOrCitizen = scanner.nextLine().split("\\s+");
            String name = rebelOrCitizen[0];
            int age = Integer.parseInt(rebelOrCitizen[1]);
            if (rebelOrCitizen.length == 4) {
                //{name} {age} {id} {birthdate}" for a Citizen or
                String id = rebelOrCitizen[2];
                String birthdate = rebelOrCitizen[3];
                Citizen citizen = new Citizen(name, age, id, birthdate);
                rebelsAndCitizen.put(name, citizen);
            } else if (rebelOrCitizen.length == 3) {
                //"{name} {age}{group}" for a Rebel
                String group = rebelOrCitizen[2];
                Rebel rebel = new Rebel(name, age, group);
                rebelsAndCitizen.put(name, rebel);
            }
            numOfPeople -= 1;
        }

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            if (rebelsAndCitizen.containsKey(input)) {
                rebelsAndCitizen.get(input).buyFood();
            }

            input = scanner.nextLine();
        }

        System.out.println(rebelsAndCitizen.values().stream()
                .mapToInt(Buyer::getFood).sum());
    }
}
