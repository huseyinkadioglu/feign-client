package guru.spring.feignclient.api;

import guru.spring.feignclient.client.MyUser;
import guru.spring.feignclient.dto.UserResponse;
import guru.spring.feignclient.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hüseyin Kadıoğlu on 16.08.2020
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;


    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/createdOnes")
    public List<MyUser> getAllMine(){
        return userService.getAllCreatedUsers();
    }

}
