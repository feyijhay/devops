package devops.devops.services;

import devops.devops.dtos.request.RegisterRequest;
import devops.devops.dtos.response.RegisterResponse;
import devops.devops.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testThatUserCanRegister(){
        RegisterRequest request = new RegisterRequest();
        request.setFirstName("Olajumoke");
        request.setLastName("Joseph");
        request.setEmail("josephfeyishetan@gmail.com");
        request.setPhoneNumber("09078480034");
        request.setPassword("12345");
        RegisterResponse response = userService.register(request);

        assertNotNull(response);
        assertTrue(response.getMessage().contains("success"));
    }

}