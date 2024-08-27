package devops.devops.services;

import devops.devops.dtos.request.LoginRequest;
import devops.devops.dtos.request.RegisterRequest;
import devops.devops.dtos.response.RegisterResponse;
import devops.devops.models.User;
import devops.devops.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        User user = modelMapper.map(request, User.class);
        user = userRepository.save(user);
        RegisterResponse response = modelMapper.map(user, RegisterResponse.class);
        response.setMessage("Registration successful");
        return response;
    }

    @Override
    public User login(LoginRequest request) {
        return null;
    }
}
