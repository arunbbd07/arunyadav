package OopsProgram; 

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import soccerPackage.SoccerInterface;




public class OopsConcept  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			OopsConcept obj=new OopsConcept();
		MethodOverLaodingProgram obj1=obj.new MethodOverLaodingProgram();
		MethodOverRiddingProgram obj2=obj.new MethodOverRiddingProgram();
		
		obj1.m(5, 9);
		obj1.m(4, 8.5, 5);
		obj1.m();
		obj2.m();
		obj1.initMe(10, 20);
		obj1.PrintMe();
	
	}
	class MethodOverLaodingProgram implements InterfaceConcept, SoccerInterface
	{
		int x=30;
		int y=40;
		void initMe(int x,int y){
			//this.x=x;
			 x=x;
			 y=y;
			//this.y=y;
		}
		void PrintMe(){
			System.out.println(" 'PrintMe' x " +x);
			System.out.println(" 'PrintMe' y" +y);
		}
		private void m1()
		{
			System.out.println(" 'm1' " + "method of Parent class");
		}
		void m()
		{
			System.out.println(" 'm' " + "method of Parent class");
		}
		void m(int a, int b)
		{
			int c=0;
			c=a+b;
			System.out.println("Sum of a & b "+c);
		}
		void m(int a, double b, int c )
		{
			double result;
			result=a+b+c;
			System.out.println("the sum of a, b & C is "+ result);
		}
		@Override
		public void IntercaceT1() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void IntercaceT2() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void IntercaceT3() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void IntercaceT4() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void test1() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void test2() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void test3() {
			// TODO Auto-generated method stub
			
		}
	}
	class MethodOverRiddingProgram extends MethodOverLaodingProgram
	{
		void m2()
		{
			System.out.println(" m2 method");
		}
		void m(int a, int b)
		{
			int k=0;
			k=a+b;
			System.out.println("the sum of overridden methos"+k) ;
		}
		void m()
		{
			this.m2();
			super.m1();
			System.out.println(" 'm' "+ "method of Child class");
		}
		
	}
	



	
	
}

