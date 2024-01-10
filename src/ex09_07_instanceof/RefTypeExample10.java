// instatnceof 사용예
package ex09_07_instanceof;
public class RefTypeExample10 {
	public static void main(String args[]) {
		Account obj1= new Account("111-22-333333333","홍길동",100000);
		// Q. obj를 CheckingAccount로 캐스팅 가능한가? ((CheckingAccount) ojb)
		if (obj1 instanceof CheckingAccount) {
			pay((CheckingAccount) obj1);
		}else {
			System.out.println("캐스트 할 수 없는 타입입니다.");
		}
	}
		

	static void pay(CheckingAccount obj1) {
		try {
			int amount = obj1.pay("5555-6666-7777-8888", 47000);
			System.out.println("인출액: "+amount);
			System.out.println("카드번호: "+obj1.cardNo);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}