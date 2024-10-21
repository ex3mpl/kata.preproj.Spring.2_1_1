import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        /*
        * App class task:
        *   1. execute helloworld bean 2 times in row
        *   2. execute cat bean 2 times in row after helloworld
        *   3. compare 2 pairs of beans using a link and display the results in the console
        * */

        // Spring-container
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // 1 task. HelloWorld bean
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBeanSecond =
                (HelloWorld) applicationContext.getBean("helloworld");

        // 2 task. Cat bean
        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        Cat catBeanSecond =
                (Cat) applicationContext.getBean("cat");

        // 3 task. Compare beans
        System.out.println("Are helloWorldBean and helloWorldBeanSecond beans the same? " +
                (helloWorldBean.equals(helloWorldBeanSecond)));     // true
        System.out.println("Are catBean and catBeanSecond beans the same? " +
                (catBean.equals(catBeanSecond)));                   // false
    }
}