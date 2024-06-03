package com.horaceneto.Movie_Ticket.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceimp implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /* CREATE NEW ACCOUNT */
    public Account createNewAccount(Account account) {
        return accountRepository.save(account);
    }


}
