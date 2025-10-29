package iago.zancanaro.user.repository;

import iago.zancanaro.user.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
