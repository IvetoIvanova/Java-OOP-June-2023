package F06Reflection.Exercise.T01HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Class<RichSoilLand> clazz = RichSoilLand.class;
        Field[] fields = clazz.getDeclaredFields();

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Consumer<Field> fieldPrinter = field -> System.out.printf("%s %s %s%n",
                Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());

        while (!command.equals("HARVEST")) {
            switch (command) {
                case "private":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isPrivate(field.getModifiers()))
                            .forEach(fieldPrinter);
                    break;
                case "protected":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isProtected(field.getModifiers()))
                            .forEach(fieldPrinter);
                    break;
                case "public":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isPublic(field.getModifiers()))
                            .forEach(fieldPrinter);
                    break;
                case "all":
                    Arrays.stream(fields).forEach(fieldPrinter);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
