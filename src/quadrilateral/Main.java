//Hình chữ nhật, Hình vuông, Hình thoi, Hình bình hành

package quadrilateral;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu rong: ");
		int chieuRong = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap chieu rong: ");
		int chieuDai = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap chieu rong: ");
		int duongCheo1 = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap chieu rong: ");
		int duongCheo2 = Integer.parseInt(sc.nextLine());
		System.out.println("Chon loai hinh: ");
		System.out.println("1. Hinh binh hanh");
		System.out.println("2. Hinh thoi");
		System.out.println("3. Hinh chu nhat");
		System.out.println("3. Hinh vuong");
		String key = sc.nextLine();
		
		switch (key) {
		case "1": {
			QuadrileteralType2 qT2 = new QuadrileteralType2(chieuDai, chieuRong, duongCheo1, duongCheo2);
			
		}
		case "2": {
			
		}
		case "3": {
			
		}
		case "4": {
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}
}
