package com.design.adapter;

/**
 * @author zhaiyj
 * @date 2019/5/23 22:10
 * @instruction
 */
public class TukeyAdpter implements Duck {

	Turkey turkey;

	public TukeyAdpter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
