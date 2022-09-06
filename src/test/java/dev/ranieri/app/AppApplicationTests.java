package dev.ranieri.app;

import dev.ranieri.entities.Score;
import dev.ranieri.repos.ScoreRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

	@Autowired
	ScoreRepo scoreRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void createScore(){
		Score score = new Score(null,"AAA",1000);
		Score savedScore = scoreRepo.save(score);
		System.out.println(score);
		System.out.println(savedScore);
	}

}
