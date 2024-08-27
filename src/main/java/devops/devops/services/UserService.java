package devops.devops.services;

import devops.devops.dtos.request.LoginRequest;
import devops.devops.dtos.request.RegisterRequest;
import devops.devops.dtos.response.RegisterResponse;
import devops.devops.models.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

   RegisterResponse register(RegisterRequest request);
    User login(LoginRequest request);
}
