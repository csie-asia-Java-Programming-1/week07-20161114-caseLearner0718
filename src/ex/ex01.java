package ex;
/*
 * Date: 2016/11/14
 * Author: 105021025 洪立宇
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入總共幾筆資料");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float[] val = new float[n];
		float sum = 0;
		float tal=0;
		for(int a=0;a<n;a++){
			System.out.println("請輸入第" + (a+1) + "筆資料");
			val[a] = scn.nextFloat();
		}
		for(int a=0;a<n;a++){
			sum = sum + val[a];
		}
		sum/=n;
		for(int a=0;a<n;a++){
			tal += fun(val[a],sum);
		}
		System.out.println(tal/n);
	}
	public static float fun(float val,float sum){
		val = (val-sum)*(val-sum);
		return val;
	}
}
