package exampractice;

import java.util.Scanner;
 
class Seat{
	String seats[];
	public Seat() {
		seats=new String[10];
		for(int i=0;i<seats.length;i++) {
			seats[i]="---";
		}
	}
	public void show() {
		for(int i=0;i<seats.length;i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println();
	}
	public void set(String name,int num) {
		if(num>10) {
			System.out.println("10 미만의 수를 입력해주셔야합니다.");
		}
		else {
			seats[num-1]=name;
		}
		return;
	}
	public boolean check(String name) {
		for(int i=0;i<seats.length;i++) {
			if(seats[i].equals(name)) {
				seats[i]="---";
				return true;
			}
		}
		return false;
	}
}
 
class manage{
	Scanner sc;
	Seat arr[];
	String Grade[]= {"S","A","B"};
	public manage() {
		sc=new Scanner(System.in);
		arr=new Seat[3];
		for(int i=0;i<3;i++) {
			arr[i]=new Seat();
		}
	}
	
	public void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		arr[g-1].show();
		
		System.out.print("이름>>");
		String name=sc.next();
		System.out.print("번호>>");
		int num=sc.nextInt();
		arr[g-1].set(name, num);
	}
	
	public void view() {
		for(int i=0;i<3;i++) {
			System.out.print(Grade[i]+">>");
			arr[i].show();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void delete() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		arr[g-1].show();
		System.out.print("이름>>");
		String name=sc.next();
		if(arr[g-1].check(name)) {
			System.out.println("<<<취소를 완료하였습니다>>>");
		}
		else {
			System.out.println("<<<존재하지 않는 이름입니다>>>");
		}
	}
	
	public void run() {
		int op;
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			op=sc.nextInt();
			
			switch(op) {
			case 1:
				reserve();
				break;
			case 2:
				view();
				break;
			case 3:
				delete();
				break;
			case 4:
				return;
			default:
				System.out.println("숫자를 잘못입력했습니다.");
				break;
			}
		}
	}
}
 
public class a {	
	public static void main(String[] args) {
		manage ms=new manage();
		ms.run();
	}
}