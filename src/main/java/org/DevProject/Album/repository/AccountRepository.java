package org.DevProject.Album.repository;

import java.util.Optional;

import org.DevProject.Album.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByEmail(String email);

}
