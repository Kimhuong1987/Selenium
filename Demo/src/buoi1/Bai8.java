package buoi1;

import java.util.Scanner;
import java.util.Random;

public class Bai8 {
	public static void main(String[] args) {
	    
	    
	    int score = 2;  
	    int user, computer;
	    String ketQua = "";
	    Scanner scanner = new Scanner(System.in);
	     
	    Random rd = new Random();
	    computer = 0 + rd.nextInt(2);
	    
	        System.out.print("Nguoi dung nhap: ");
	        user = scanner.nextInt();
	             
	        if (user != computer) {
	            ketQua = "==> Hòa!";
	            System.out.println(ketQua);
	            score--;
	        } else {
	            ketQua = "==> Thua";
	            System.out.println(ketQua);
	            score++;
	        }
	 
	        if (score == 0) {
	            System.out.println("Keo");
	           
	        } 
	             
	        if (score == 1) {
	            System.out.println("Bua");
	            
	        
	        if (score == 2) {
	            System.out.println("Bao");
	           
	        }
	    }
	}
}

