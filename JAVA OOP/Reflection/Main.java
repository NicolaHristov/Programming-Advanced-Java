import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Scanner scanner = new Scanner(System.in);


        Class clazz= Reflection.class;
        System.out.println(clazz);

        System.out.println(clazz.getSuperclass());
        Class[]interfaces= clazz.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        Reflection reflection=(Reflection) clazz.getDeclaredConstructor().newInstance();
        System.out.println(reflection);

//        Reflection reflection=new Reflection();
//        System.out.println(reflection);

    }
}
