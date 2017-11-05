package za.co.reverside.ecommerce.usermanagement.controllers;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.reverside.ecommerce.usermanagement.model.Login;

@RestController
public class LoginController {

    @RequestMapping(value = "/api/login",method = RequestMethod.POST)
    public String userLogin(@RequestBody Login loginuser) {
        if(loginuser!=null){
            return (loginuser.getUsername());
        }else{
            return "request not valid";
        }
    }

}
