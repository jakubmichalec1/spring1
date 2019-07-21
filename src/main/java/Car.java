
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

    private Engine engine;

    public Car() {

    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void getPower() {
        System.out.println(engine.getPower());
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car obj = (Car) context.getBean("car");
        obj.engine.setPower(100);
        obj.getPower();

    }
}