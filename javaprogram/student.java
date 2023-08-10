package training;

import java.util.Scanner;
class Detial
{
	Scanner sc=new Scanner(System.in);
	String name;
	int rollno;
	String s2="k.s.r college of engineering";
	char sec;
	void insert()
	{
		System.out.println("enter the name");
//		name=n;
		name=sc.next();
		System.out.println("enter the rollno");
//		rollno=r;
		rollno=sc.nextInt();
		System.out.println("enter the section");
//		sec=s;
		sec=sc.next().charAt(0);
	}
	void display()
	{
		
		System.out.println(name+" "+rollno+" "+sec);
	}

}

public class student {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detial d=new Detial();
		d.insert();
		d.display();
		
	}

}
