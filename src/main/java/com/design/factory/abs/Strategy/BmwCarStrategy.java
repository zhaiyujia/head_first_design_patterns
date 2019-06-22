package com.design.factory.abs.Strategy;

import com.design.factory.abs.BmwCar;
import com.design.factory.abs.Car;

/**
 * @author zhaiyj
 * @date 2019/6/22 19:31
 * @instruction
 */
public class BmwCarStrategy implements Strategy {


	@Override
	public Car create() {
		return new BmwCar();
	}

}

