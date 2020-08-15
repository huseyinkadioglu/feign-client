package guru.spring.feignclient.client;

import lombok.Data;

/**
 * @author Hüseyin Kadıoğlu on 16.08.2020
 */
@Data
public class MyUser {
    private String name;
    private String lastName;
    private Integer age;
}
