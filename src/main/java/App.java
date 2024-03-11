import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());


        ApplicationContext applicationContextCat = new AnnotationConfigApplicationContext(AppConfig.class);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");


        System.out.println(beanCat.getName());
        System.out.println(beanCat2.getName());

        System.out.println(bean == bean2);
        System.out.println(beanCat == beanCat2);


    }
}