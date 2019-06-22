package com.design.strategy.member;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:56
 * @instruction
 */
public class BuyBooks {

	CalculateStrategy strategy;

	public BuyBooks(CalculateStrategy strategy) {
		this.strategy = strategy;
	}

	public double getPrice(double price){
		return strategy.calculatePrice(price);
	}


}
