package guru.spring.feignclient.service;

import guru.spring.feignclient.client.UserClient;
import guru.spring.feignclient.dto.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hüseyin Kadıoğlu on 16.08.2020
 */
@Service
@AllArgsConstructor
public class UserService {

    private final UserClient client;

    public List<UserResponse> getAllUsers() {
        return client.getAllUsers();
    }


}
