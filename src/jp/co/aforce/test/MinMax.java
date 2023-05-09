package jp.co.aforce.test;


public class MinMax {
	
	/* 練習問題２ */
	
	public int getMaxValue(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		return max;
	}

	public int getMinValue(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		return min;
	}

}
