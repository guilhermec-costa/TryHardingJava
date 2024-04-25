package com.javaIntro.SpringAppDatabase.database;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.javaIntro.SpringAppDatabase.database.domain.Author;

@SpringBootTest
class PostgresDatabaseApplicationTests {

	@Test
	void contextLoads() {
	}

    @Test
    void testAuthor() {
        Author author = Author.builder()
            .name("Churros")
            .age(9)
            .build();
        System.out.println(author);
    }

}
