package ru.netology.authorizationService.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import ru.netology.authorizationService.controller.AuthorizationController;
import ru.netology.authorizationService.repository.UserRepository;
import ru.netology.authorizationService.repository.UserRepositoryImpl;
import ru.netology.authorizationService.service.AuthorizationService;
import ru.netology.authorizationService.service.AuthorizationServiceImpl;

@Configuration
public class JavaConfig {
    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    @Bean
    public AuthorizationService authorizationService(UserRepository repository) {
        return new AuthorizationServiceImpl(repository);
    }

    @Bean
    public AuthorizationController authorizationController(AuthorizationService service) {
        return new AuthorizationController(service);
    }

}
