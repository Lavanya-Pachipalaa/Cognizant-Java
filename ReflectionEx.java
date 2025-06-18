import java.lang.reflect.Method;

class SampleClass {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    private void secretMethod() {
        System.out.println("This is a private method.");
    }
}

public class ReflectionEx {
    public static void main(String[] args) {
        try {
            Class<?> classes = Class.forName("SampleClass");
            Object obj = classes.getDeclaredConstructor().newInstance();
            Method[] methods = classes.getDeclaredMethods();
            System.out.println("Methods available in SampleClass:");
            for (Method method : methods) {
                System.out.println(method.getName() + " - Parameters: " + method.getParameterCount());
            }
            Method greetMethod = classes.getDeclaredMethod("greet", String.class);
            greetMethod.invoke(obj, "Harika");
            Method secretMethod = classes.getDeclaredMethod("secretMethod");
            secretMethod.setAccessible(true);
            secretMethod.invoke(obj);
        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}
