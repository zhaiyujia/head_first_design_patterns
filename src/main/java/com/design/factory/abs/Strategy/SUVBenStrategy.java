package com.design.factory.abs.Strategy;

import com.design.factory.abs.Car;
import com.design.factory.abs.SUVBenzCar;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:27
 * @instruction
 */
public class SUVBenStrategy implements Strategy{


	@Override
	public Car create() {
		return new SUVBenzCar();
	}
}
