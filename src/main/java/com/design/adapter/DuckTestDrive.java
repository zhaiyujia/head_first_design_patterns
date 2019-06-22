package com.design.adapter;

/**
 * @author zhaiyj
 * @date 2019/5/23 22:11
 * @instruction
 */
public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTukey tukey = new WildTukey();
		Duck trukeApapter = new TukeyAdpter(tukey);

		System.out.println("The Turkey says...");
		tukey.gobble();
		tukey.fly();

		System.out.println("The Duck says...");
		testDuck(duck);

		System.out.println("The turkeyAdapter says...");
		testDuck(trukeApapter);


	}

	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
