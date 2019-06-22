package com.design.factory.abs.Strategy;

import com.design.factory.abs.BenzCar;
import com.design.factory.abs.Car;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:32
 * @instruction
 */
public class BenzCarStrategy implements Strategy {

	@Override
	public Car create() {
		return new BenzCar();
	}

}
