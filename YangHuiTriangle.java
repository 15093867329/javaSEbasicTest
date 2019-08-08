package com.neuedu.test;

import java.util.Scanner;

public class YangHuiTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÐÐÊý");
		int n = input.nextInt();
		yhs(n);
		input.close();
		
	}
	public static void yhs(int n) {
        int h;
        for (int i = 0; i < n; i++) {
            h = 1;
            for (int k = i; k < n - 1; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", h);
                h = h * (i - j) / (j + 1);
		    }
		    System.out.println();
	    }
	}

}
