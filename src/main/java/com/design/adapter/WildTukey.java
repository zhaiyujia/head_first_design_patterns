package com.design.adapter;

/**
 * @author zhaiyj
 * @date 2019/5/23 22:08
 * @instruction
 */
public class WildTukey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
