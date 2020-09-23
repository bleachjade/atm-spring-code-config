package atm;

import atm.config.ATMConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        ATM atm = context.getBean("atm", ATM.class);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}