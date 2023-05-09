package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {
		
		/* 
		 * 練習問題１１ 
		 */
		PracticeTest8 test8 = new PracticeTest8();
		
		/* 練習問題１ */	System.out.println("====練習問題１====");
		test8.printHello();
		
		/* 練習問題２ */	System.out.println("\n====練習問題２====");
		test8.printRandomMessage();
		
		/* 練習問題３ */	System.out.println("\n====練習問題３====");
		test8.printMessage("good morning");
		
		/* 練習問題４ */	System.out.println("\n====練習問題４====");
		test8.printMessage("Hi", 5);
		
		/* 練習問題５ */	System.out.println("\n====練習問題５====");
		test8.printRectangleArea(2, 3);
		
		/* 練習問題６ */	System.out.println("\n====練習問題６====");
		System.out.println(test8.getWeatherForecast());
		
		/* 練習問題７ */	System.out.println("\n====練習問題７====");
		System.out.println("8は偶数である：" + test8.isEvenNumber(8));
		System.out.println("5は偶数である：" + test8.isEvenNumber(5));
		
		/* 練習問題８ */	System.out.println("\n====練習問題８====");
		System.out.println(test8.getMessage("花子", true));
		System.out.println(test8.getMessage("太郎", false));
		
		/* 練習問題９ */	System.out.println("\n====練習問題９====");
		String[] strList = {"国分寺", "国会議事堂前", "東京", "阿佐ヶ谷", "天王洲アイル"};
		System.out.println(test8.getLongestString(strList));
		
		/* 練習問題１０ */ 	System.out.println("\n====練習問題１０====");
		Person hanako = new Person("花子", 12);
		Person taro = new Person("太郎", 25);
		System.out.println("花子は成人している：" + test8.isAdult(hanako));
		System.out.println("太郎は成人している：" + test8.isAdult(taro));
	}

}
