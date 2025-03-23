package com.demo.amanabank.controller;

import com.demo.amanabank.model.BankAccount;
import com.demo.amanabank.services.BankServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/accounts")

public class BankController {
    private BankServices bankServices;

    @GetMapping("/all")
    public List<BankAccount> getBankAccounts(){
        return bankServices.getBankAccounts();
    }
    @GetMapping("/{id}")
    public BankAccount getBankAccountById(@PathVariable Long id){
        return bankServices.getBankAccountById(id);
    }
    @PostMapping("/add")
    public BankAccount addAccount(BankAccount bankAccount){
        return bankServices.addAccount(bankAccount);

    }
    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable Long id) {
        bankServices.deleteAccount(id);


    }
}
