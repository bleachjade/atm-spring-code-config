package atm.config;

import atm.ATM;
import atm.Bank;
import atm.DataSource;
import atm.DataSourceFile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {

    @Bean
    public Bank bank() {
        return new Bank("My Bank", dataSource());
    }

    @Bean
    public ATM atm() {
        return new ATM(bank());
    }

    @Bean
    public DataSource dataSource() {
        return new DataSourceFile("customers.txt");
    }
}
