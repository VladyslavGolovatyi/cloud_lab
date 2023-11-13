package ua.lviv.iot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
//@EnableWebSecurity
public class CustomSecurityConfig {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**", "/swagger-ui.html","/swagger-ui/index.html", "/swagger-ui").authenticated()
                        .requestMatchers(HttpMethod.GET, "/airlines", "/airports").authenticated()
                        .requestMatchers(HttpMethod.POST, "/airlines").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/airports/{id}").authenticated()
                        .anyRequest().denyAll())
                .httpBasic();
        return http.build();
    }
}
