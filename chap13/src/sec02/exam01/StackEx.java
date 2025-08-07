package sec02.exam01;

import java.util.Stack;

// 동전 케이스를 Stack 클래스로 구현한 예제
// 동저 케이스는 위에만 열려있는 스택 구조를 가짐
// 먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에
// Stack에서 동전을 뺴면 마지막에 넣은 동전이 먼저 나오게됨
// => LIFO
public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전을 끼움
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));

		// 동전 케이스가 비었는지 확인
		while (!coinBox.isEmpty()) {
			// 제일 위 동전을 꺼냄
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
			// LIFO이기 때문에 출력하면 push한 반대 순서로 나옴
		}
		
		
		System.out.println(coinBox);	// pop으로 다 꺼냈기 때문에 비어 있음 (제거)
										// pick은 가져오기만 (제거 X)
	
	
	
	
	
	
	
	
	
	
	
	}

}
