package com.meftaul.bankapp;

import com.meftaul.bankapp.entities.Bank;
import com.meftaul.bankapp.entities.Branch;
import com.meftaul.bankapp.repository.BankRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankRepository bankRepository) {
        return args -> {
            Bank aBank = new Bank("ABC BANK");

            aBank.getBranches().add(
                    new Branch("001", "1234")
            );

            aBank.getBranches().add(
                    new Branch("002", "1235")
            );

            aBank.getBranches().add(
                    new Branch("003", "1236")
            );

            aBank = bankRepository.save(aBank);

            /*Bank aBank = bankRepository.findById(1l).get();*/

            System.out.println("=================");
            System.out.println(aBank);
        };
    }

}
