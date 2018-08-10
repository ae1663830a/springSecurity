package lt.aejavap.security.authapp.controller;

import lt.aejavap.security.authapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(path = "api/v1/user/info")
    public UserDetails getRoles() {
        Authentication authUser = SecurityContextHolder.getContext().getAuthentication();
        return accountService.loadUserByUsername(authUser.getName());
    }
}
