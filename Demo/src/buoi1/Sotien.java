package buoi1;
import java.util.Scanner;

public class Sotien {
	
	public static void main(String[] args) {
	System.out.println("Nhập số tiền cần chuyển đổi:");
	Scanner scMoney = new Scanner(System.in);
	int soTienNhap = scMoney.nextInt();
	System.out.println("Nhập 1: đổi tiền từ USD sang VND, 2: đổi tiền từ VND sang USD:");
	Scanner scOption = new Scanner(System.in);
	int luaChon = scOption.nextInt();

	if(luaChon == 1) {
	float USD = soTienNhap * 23000;
	System.out.println("USD doi ra VND:" + USD);
	} else if(luaChon == 2) {
	float VND = soTienNhap/23000;
	System.out.println("VND doi ra USD:"+ VND);
	}
	}
}