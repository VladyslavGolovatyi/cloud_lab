package ua.lviv.iot.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationClient {
    private String username;
    private String password;
    private String[] roles;
}
