package bai3;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("nhap so phan tu cua mang:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("nhap tung phan tu:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		sapxeptangdan(a, n);
		for (int i = 0; i < n; i++) {
			System.out.println("phan tu thu " +i +": "+a[i]);
		}
	}

	public static void sapxeptangdan(int a[], int n) {
		int tg = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (a[i] > a[j]) {
					tg = a[i];
					a[i] = a[j];
					a[j] = tg;

				}
			}
		}
	}
}
