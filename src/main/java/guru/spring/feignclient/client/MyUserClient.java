package guru.spring.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Hüseyin Kadıoğlu on 16.08.2020
 */
@FeignClient(name = "MY-CLIENT",url = "http://localhost:9191")
public interface MyUserClient {

    @GetMapping("/getAll")
    public List<MyUser> getAllCreatedUsers();
}
