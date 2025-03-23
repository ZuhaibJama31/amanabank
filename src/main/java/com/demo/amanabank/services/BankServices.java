package com.demo.amanabank.services;

import com.demo.amanabank.model.BankAccount;
import com.demo.amanabank.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class BankServices {

    private BankRepository bankRepository;


    public List<BankAccount> getBankAccounts(){
        return bankRepository.findAll();
    }
    public BankAccount getBankAccountById(Long id){
        return bankRepository.findById(id).orElse(null);
    }
    public BankAccount createAccount(BankAccount bankAccount) {
        return bankRepository.save(bankAccount);
    }


}
