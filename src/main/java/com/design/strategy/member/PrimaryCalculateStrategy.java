package com.design.strategy.member;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:55
 * @instruction
 * 初级会员
 */
public class PrimaryCalculateStrategy implements CalculateStrategy {

	@Override
	public double calculatePrice(double price) {
		price = price;
		return price;
	}
}
