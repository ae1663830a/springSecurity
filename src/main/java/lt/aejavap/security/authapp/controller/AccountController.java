package lt.aejavap.security.authapp.controller;

import lt.aejavap.security.authapp.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @GetMapping(path = "api/v1/user/info")
    @PreAuthorize("hasRole('ROLE_MASTER')")
    public UserDetails getAuthUserInfo() {
        Authentication authUser = SecurityContextHolder.getContext().getAuthentication();
        LOGGER.debug("Returning info of {} with '{}' roles", authUser.getName(), authUser.getAuthorities());
        return accountService.loadUserByUsername(authUser.getName());
    }

}
