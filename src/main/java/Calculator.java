import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculator {

    private Integer a = 2;
    private Integer b = 3;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Calculator obj = (Calculator) context.getBean("calculator");
            obj.setA(100);
            obj.getA();

            Calculator obj2 = (Calculator) context.getBean("calculator");
            obj2.getB();
        }
    }
