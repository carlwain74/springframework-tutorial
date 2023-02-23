package com.springdemo.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springdemo.learnspring.game.GameRunner;;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringApplication.class, args);
		
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		
		
		//GamingConsole game = new MarioGame();
		//GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();
	}

}
