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
			System.out.println("10 �̸��� ���� �Է����ּž��մϴ�.");
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
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		arr[g-1].show();
		
		System.out.print("�̸�>>");
		String name=sc.next();
		System.out.print("��ȣ>>");
		int num=sc.nextInt();
		arr[g-1].set(name, num);
	}
	
	public void view() {
		for(int i=0;i<3;i++) {
			System.out.print(Grade[i]+">>");
			arr[i].show();
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	public void delete() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int g=sc.nextInt();
		System.out.print(Grade[g-1]+">>");
		arr[g-1].show();
		System.out.print("�̸�>>");
		String name=sc.next();
		if(arr[g-1].check(name)) {
			System.out.println("<<<��Ҹ� �Ϸ��Ͽ����ϴ�>>>");
		}
		else {
			System.out.println("<<<�������� �ʴ� �̸��Դϴ�>>>");
		}
	}
	
	public void run() {
		int op;
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
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
				System.out.println("���ڸ� �߸��Է��߽��ϴ�.");
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