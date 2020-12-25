package oneHourJavaLesson;

public class Hello {
    final static int num = 42;

    Hello(int year) {
        String message = "Hello, World!";
        System.out.println(message + " " + year);
        System.out.println(String.format("%s %s", message, year));
    }
}
