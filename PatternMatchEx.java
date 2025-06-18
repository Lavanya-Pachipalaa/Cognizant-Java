public class PatternMatchEx{
    public static void TypeChecking(Object o) {
        switch (o) {
            case Integer i -> System.out.println("The number is an Integer: " + i);
            case String s -> System.out.println("The text is a String: " + s);
            case Double d -> System.out.println("The value is a Double: " + d);
            case null -> System.out.println("It is a Null Value.");
            default -> System.out.println("Unknown type: " + o.getClass().getSimpleName());
        }
    }
    public static void main(String[] args) {
        TypeChecking(29);
        TypeChecking("Hi...");
        TypeChecking(0.05);
        TypeChecking(null);
        TypeChecking(true); // Default case for unhandled types
    }
}
