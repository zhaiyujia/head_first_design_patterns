package com.design.strategy.member;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:58
 * @instruction
 */
public class TestStrategy {

	public static void main(String[] args) {
		BuyBooks books = new BuyBooks(new MiddleCalculateStrategy());
		System.out.println("中级会员：" + books.getPrice(1000));


		books = new BuyBooks(new HighCalculateStrategy());
		System.out.println("高级会员：" + books.getPrice(1000));


		books = new BuyBooks(new PrimaryCalculateStrategy());
		System.out.println("初级会员：" + books.getPrice(1000));

	}

}
