package iago.zancanaro.user.service;

import iago.zancanaro.user.domain.UserModel;
import iago.zancanaro.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserModel createUser(UserModel user) {
        return user = userRepository.save(user);
    }
}
