package sec06.exam02.mycompany;

//import sec06.exam02.hankok.SnowTire;
import sec06.exam02.hankok.*;
import sec06.exam02.hankok.Tier;
import sec06.exam02.hyundai.Engine;
//import sec06.exam02.kumho.BigWidthTire;
import sec06.exam02.kumho.*;

public class Car {
	// 핃드(집합관계)
	// 자동완성 기능(ctrl + space) 사용 시 자동 import 또는 단축키(ctrl + shift + o) 사용
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	// 한국 타이어 사용
	Tier tier3 = new Tier();
	
	// 금호 타이어 사용
	// 한국 타이어가 임포트 돼있는데, 금호 타이어를 쓰고 싶으면?
	sec06.exam02.kumho.Tier tier4 = new sec06.exam02.kumho.Tier();
	
	// import문을 사용할 수 없으면 클래스의 풀네임을 사용하여 명시적으로 작성하면됨
	// 근데 클래스명을 동일하게 만드는 경우가 거의 없음
	
	
}
