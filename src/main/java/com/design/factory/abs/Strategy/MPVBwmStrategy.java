package com.design.factory.abs.Strategy;

import com.design.factory.abs.Car;
import com.design.factory.abs.MPVBwmCar;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:30
 * @instruction
 */
public class MPVBwmStrategy implements Strategy{

	@Override
	public Car create() {
		return new MPVBwmCar();
	}
}