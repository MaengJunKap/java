
public class Barista {
	
    String Menu = "메뉴판";
    String Vibrationbell= "진동벨";
    String coffemachine = "커피기계";
	
	
	void order(){
		
		System.out.println(Menu+"을 손님에게 건내주고 주문을 받는다.");
	}
	

	void coffe(){
		
		System.out.println(coffemachine+"으로 커피를 만든다.");
	}
	
	void bell(){
		
		System.out.println(Vibrationbell+"로 손님에게 알려준다.");
		
	}

	
}
