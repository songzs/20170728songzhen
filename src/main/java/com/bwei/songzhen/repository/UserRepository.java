package com.bwei.songzhen.repository;

import com.bwei.songzhen.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by songzhen on 2017/7/28.
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    User findOne(User user);
    void updateUser(User user);
}
