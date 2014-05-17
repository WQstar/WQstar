import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		System.out.println("杨辉三角");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		PTriangle(k);
	}
//按照杨辉三角的规律编码数组
	public static void PTriangle(int n) {
		int i = 0, j = 0;
		int[][] a = new int[n][2 * n];
		for (i = 0; i < n; i++) {
			a[i][n - 1 - i] = 1;
			a[i][n - 1 + i] = 1;
		}// 边界赋初值
		for (i = 1; i < n; i++)
			for (j = 1; j < 2 * n - 1; j++)
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j + 1];// 杨辉三角计算方法
		for (i = 0; i < n; i++) {
			for (j = 0; j < 2 * n; j++) {
				if (a[i][j] != 0)
					System.out.print("\t" + a[i][j]);
				else
					System.out.print("\t");
			}// 按特定公式输出
			System.out.println();
		}
	}
}