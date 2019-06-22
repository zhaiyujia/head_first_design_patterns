package com.design.strategy.member;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:51
 * @instruction
 * 高级会员
 */
public class HighCalculateStrategy implements CalculateStrategy {

	@Override
	public double calculatePrice(double price) {
		price  = price / 0.2 +price;
		return price;
	}
}
