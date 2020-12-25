package oneHourJavaLesson;

public class Main {

    public static void main(String[] args) {
        //new Hello(2020);

        System.out.println(Hello.num);
        //Lesson.arrayLesson();
        //Lesson.array2DLesson();
        //Lesson.loopWhile();
        //Lesson.loopDoWhile();
        //Lesson.switchCase();
        //Lesson.scanLesson();

        Paper a4 = new Paper(210, 297);

        Paper myPaper = new Paper();

        Product product = new Product(a4.width, a4.height, 25, "white");
        System.out.println(product);
    }
}
