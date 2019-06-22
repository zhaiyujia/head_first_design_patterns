package com.design.strategy.member;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:54
 * @instruction
 * 中级会员
 */
public class MiddleCalculateStrategy implements CalculateStrategy {

	@Override
	public double calculatePrice(double price) {
		price = price / 0.1 + price;
		return price;
	}
}
