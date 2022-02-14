package shai.zambrovski.poc.migration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shai.zambrovski.poc.migration.model.User;

public interface SimpleRepository extends JpaRepository<User, Integer> {
}
