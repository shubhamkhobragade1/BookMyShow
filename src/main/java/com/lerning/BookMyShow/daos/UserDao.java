package com.lerning.BookMyShow.daos;

import com.lerning.BookMyShow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

    @Override
    Optional<User> findById(Long userId);
    // on graund it do select * from users where id=userId

    Optional<User> findByEmail(String mail);

    @Override
    User save(User entity);
}
