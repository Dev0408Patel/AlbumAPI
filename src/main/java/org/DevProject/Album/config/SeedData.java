package org.DevProject.Album.config;

import org.DevProject.Album.model.Account;
import org.DevProject.Album.service.AccountService;
import org.DevProject.Album.util.constants.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("dev@user.com");
        account01.setPassword("tempPassword");
        account01.setAuthorities(Authority.USER.toString());
        accountService.save(account01);

        account02.setEmail("devpatel@admin.com");
        account02.setPassword("tempPassword");
        account02.setAuthorities(Authority.ADMIN.toString() + " " + Authority.USER.toString());
        accountService.save(account02);

    }

}
