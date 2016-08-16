package com.mqm.test;

public abstract class Duck {
	FlyBehavior flyBehavior;	//定义两接口变量，具体代码实现交给 实现了这两个接口的类（面向接口编程）
	QuackBehavior quackBehavior;
	
	public Duck(){};
	
	public abstract void display();
	
	public void fly(){
		flyBehavior.fly();
	}
	
	public void quack(){
		quackBehavior.quack();
	}

	//添加set方法可以改变鸭子的行为
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
