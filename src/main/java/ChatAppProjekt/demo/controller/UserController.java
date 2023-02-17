package ChatAppProjekt.demo.controller;

import ChatAppProjekt.demo.model.User;
import ChatAppProjekt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        User savedUser = userService.registerUser(user.getUsername(), user.getPassword(), user.getPhoneNumber());
        if (savedUser == null) return "{\"user\":\"" + "exists" + "\"}"; // user already exists
        return "{\"user\":\"" + user.toString() + "\"}";
    }
}
