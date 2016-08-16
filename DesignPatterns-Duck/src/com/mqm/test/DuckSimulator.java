package com.mqm.test;

public class DuckSimulator {
	public static void main(String[] args) {
		Duck miniDuck = new MiniDuck();
		miniDuck.display();
		miniDuck.fly();
		miniDuck.quack();
		
		//现在改变鸭子的行为
		miniDuck.setQuackBehavior(new Squeak());
		miniDuck.quack();
	}
}
