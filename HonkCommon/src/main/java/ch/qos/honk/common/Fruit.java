package ch.qos.honk.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fruit {

	
	Logger logger = LoggerFactory.getLogger(Fruit.class);
	
	public void foo(String prefix) {
		logger.info(prefix+"  hello fruit");
	}
}
