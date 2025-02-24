package pest;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class prestV3 {
    public static void main(String[] args) {
//En utilisant le Framework Spring Version
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }

}
