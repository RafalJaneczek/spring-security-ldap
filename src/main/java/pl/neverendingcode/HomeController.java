package pl.neverendingcode;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getLoginPage() {
        return "You have successfully logged in Using Spring Security LDAP Authentication!";
    }

}
