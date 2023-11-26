package F04InterfacesAndAbstraction.Lab.T05BorderControl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        Map<String, Identifiable> identifiableObjects = new LinkedHashMap<>();
        while (!"End".equals(line = scanner.nextLine())) {
            String[] data = line.split("\\s+");
            String modelOrName = data[0];
            if (data.length == 3) {

                int age = Integer.parseInt(data[1]);
                String id = data[2];
                Identifiable citizen = new Citizen(modelOrName, age, id);
                identifiableObjects.put(id, citizen);
            } else if (data.length == 2) {
                String id = data[1];
                Identifiable robot = new Robot(id, modelOrName);
                identifiableObjects.put(id, robot);
            }
        }

        String fakeId = scanner.nextLine();

        identifiableObjects.keySet()
                .stream()
                .filter(i -> i.endsWith(fakeId))
                .forEach(System.out::println);
    }
}
