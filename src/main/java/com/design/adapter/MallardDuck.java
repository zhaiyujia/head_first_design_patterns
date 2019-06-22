package com.design.adapter;

/**
 * @author zhaiyj
 * @date 2019/5/23 22:06
 * @instruction
 */
public class MallardDuck implements Duck {


	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
