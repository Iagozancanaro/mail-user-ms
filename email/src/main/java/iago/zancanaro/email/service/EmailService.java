package iago.zancanaro.email.service;

import iago.zancanaro.email.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private EmailRepository emailRepository;
}
