package F01WorkingWithAbstraction.Exercise.T06GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacityOfTheBag = Long.parseLong(scanner.nextLine());
        String[] itemAndQuantityPairs = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();

        for (int i = 0; i < itemAndQuantityPairs.length; i += 2) {
            String name = itemAndQuantityPairs[i];
            long quantity = Long.parseLong(itemAndQuantityPairs[i + 1]);
            String type = "";

            if (name.length() == 3) {
                type = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (name.equalsIgnoreCase("gold")) {
                type = "Gold";
            }

            if (type.equals("")) {
                continue;
            } else if (capacityOfTheBag < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (type) {
                case "Gem":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gold")) {
                            if (breakRules(bag, quantity)) continue;
                        } else {
                            continue;
                        }
                    } else if (bag.get(type).values().stream().mapToLong(e -> e).sum() + quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(type)) {
                        if (bag.containsKey("Gem")) {
                            if (breakRules(bag, quantity)) continue;
                        } else {
                            continue;
                        }
                    } else if (bag.get(type).values().stream().mapToLong(e -> e).sum() + quantity > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(type)) {
                bag.put((type), new LinkedHashMap<>());
            }

            if (!bag.get(type).containsKey(name)) {
                bag.get(type).put(name, 0L);
            }


            bag.get(type).put(name, bag.get(type).get(name) + quantity);
        }

        printItemsInTheBag(bag);
    }

    private static boolean breakRules(LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long quantity) {
        return quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum();
    }

    private static void printItemsInTheBag(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        for (var type : bag.entrySet()) {
            Long sumValues = type.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", type.getKey(), sumValues);

            type.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(item -> System.out.println("##" + item.getKey() + " - " + item.getValue()));

        }
    }
}
