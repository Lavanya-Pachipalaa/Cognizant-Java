import java.util.List;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class Records {
    public static void main(String[] args) {
        List<Person> list = List.of(
            new Person("Harika", 19),
            new Person("Hasini", 16),
            new Person("Preethi", 27),
            new Person("Meghana", 12)
        );
        list.forEach(System.out::println);
        List<Person> adults = list.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());
        System.out.println("\nAdults :");
        adults.forEach(System.out::println);
    }
}
