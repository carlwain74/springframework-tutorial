package com.springdemo.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Enter hole");
	}
	
	public void left() {
		System.out.println("Stop");
	}
	
	public void right() {
		System.out.println("Speed up");
	}
}
