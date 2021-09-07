package duong.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

		public static int[] nhapMang() {
			int A[] = new int[10];
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap du lieu cho mang: ");
			for (int i = 0; i <A.length; i++) {
				System.out.printf("A[%d] = ",i);
				A[i] = sc.nextInt();
			}
			return A;
		}

		public static void xuatMang(int B[]) {
			System.out.print("Danh sach mang: ");
			System.out.println("\n");
			for(int i=0;i<B.length;i++)
			{
				System.out.print("\t"+B[i]);
			}
		}

		public static int demMang(int C[]) {
			int dem = 0;
			for (int i=0;i<C.length;i++) {
				if (C[i]%2 == 0) {
					dem++;
				}
			}
			return dem;
		}

		public static void inMang(int D[]) {
			System.out.println("Cac gia tri chia het cho 2 nhung ko chia het cho 3 la:\n");
			for (int i=0;i<D.length;i++) {
				if ((D[i]%2 == 0) && (D[i]%3 != 0)) {
					System.out.printf("%d\t",D[i]);
				}
			}
		}

		public static boolean kiemTraMang(int x, int E[]) {
			for (int i=0;i<E.length;i++) {
				if(x == E[i]) 
					return true;
			}
			return false;
		}

		public static boolean kiemTraMangTangDan(int F[]) {
			boolean kt = true;
			for (int i = 0; i < F.length-1; i++) {
				if (F[i] < F[i+1] == false) {
					kt = false;
				}
			}
			return kt;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int G[] = new int[10];
			G = nhapMang();
			xuatMang(G);
			int tam = demMang(G);
			System.out.println("\n");
			System.out.println("So so chan la: " + tam);
			inMang(G);
			Scanner sc = new Scanner(System.in);
			System.out.println("\nNhap x = ");
			int x = sc.nextInt();
			if (kiemTraMang(x, G) == true) {
				System.out.println("So x thuoc mang");
			}else {
				System.out.println("So x khong thuoc mang");
			}
			if (kiemTraMangTangDan(G) == true) {
				System.out.println("\nMang tang dan");
			}else {
				System.out.println("\nMang khong tang dan");
			}
		}
	}


