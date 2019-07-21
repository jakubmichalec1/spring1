import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleCalculation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculation obj = (Calculation) context.getBean("calculation");
        obj.setSum(100);
        obj.getSum();

        Calculation obj2 = (Calculation) context.getBean("calculation");
        obj2.getSum2();
    }
}