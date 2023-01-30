package com.greedy.section02.extend.run;

import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;
import com.greedy.section02.extend.Bunny;
public class Application1 {

	public static void main(String[] args) {

//		RabbitFarm<Animal> farm1 = new RabbitFarm<>();
		
//		RabbitFarm<Mammal> farm1 = new RabbitFarm<>();

//		RabbitFarm<Snake> farm1 = new RabbitFarm<>();
		
		/* Rabbit 타입이나 Rabbit 타입의 후손으로 타입변수를 설정해야 인스턴스를 생성할 수 있다.*/
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
		
//		farm3.setAnimal(new Snake());
		
		farm1.setAnimal(new Rabbit());
		((Rabbit)farm1.getAnimal()).cry();
		farm1.getAnimal().cry();       // 형변환 생략 가능
		
		farm2.setAnimal(new Bunny());
		farm2.getAnimal().cry();
	
		farm3.setAnimal(new DrunkenBunny());
		farm3.getAnimal().cry();
	}

}
