package Homework;

public class TestHomework {

	public static void main(String[] args) {

		Homework   homework = new    Homework();

		System.out.println("non-static variable of Homework class from TestHomework class is ="+Homework.i);

		Homework.methodOne();

		Homework.methodTwo();


		System.out.println("static variable of Homework class from TestHomework class is ="+Homework.j);

		Homework.methodThree();

		Homework.methodFour();

	}		

		

}
