package buoi1;

public class VaribleScope {

	static String myName = "Huong"; //global varible (bien toan cuc)

	public static void test() {
		final String myName = "huong";
		// System.out.println(Tester); (*)
		// cau lenh tren ko chay duoc do tester nam o mot phuon thuc khac
		System.out.println(myName);
	}

	public static void main(String[] args) {

		System.out.println("ten cua tui la " + myName);
		// không chay duoc do bien myname duoc dinh nghia o duoi cau lenh
		// tester nam trong phuong thuc main nen chi dung duoc trong main thui,
		// khong duoc dung o ngoai
		// do la ly do tester (*) ko chay duoc
		String tester = "Tester"; //local varible (bien cuc bo)

	}

}
