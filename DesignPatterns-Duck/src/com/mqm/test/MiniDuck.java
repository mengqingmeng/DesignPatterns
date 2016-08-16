package com.mqm.test;

public class MiniDuck extends Duck implements QuackBehavior,FlyBehavior{

	@Override
	public void display() {
		System.out.println("我是一只小鸭子");
	}
	
	//由于继承自Duck类，所以在实现中，为Duck类的两个接口变量 赋值
	public MiniDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
}
