package com.greenfoxacademy.workshop;

import com.greenfoxacademy.workshop.Models.MyUser;
import com.greenfoxacademy.workshop.Repositories.MyUserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WorkshopApplication.class)
public class InMemoryDBTest {
    @Autowired
    MyUserRepository myUserRepository;

    @Test
    public void should_get_h2_db_records() {
        MyUser userActual = myUserRepository.save(new MyUser("TestName", "TestPassword"));

        Optional<MyUser> expected = myUserRepository.findById(userActual.getId());

        Assert.assertEquals(userActual.getUserName(),expected.get().getUserName());
    }
}
