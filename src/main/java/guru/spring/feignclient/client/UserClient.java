package guru.spring.feignclient.client;

import guru.spring.feignclient.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Hüseyin Kadıoğlu on 16.08.2020
 */
@FeignClient(url = "https://jsonplaceholder.typicode.com/",name = "USER-CLIENT")
public interface UserClient {
    /*
    For this clients response , i used schema2pojo.com to create pojos. It easy to convert so easily.
     */

    @GetMapping("/users")
    public List<UserResponse> getAllUsers();
}
