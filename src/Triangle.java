import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		System.out.println("�������");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		PTriangle(k);
	}
//����������ǵĹ��ɱ�������
	public static void PTriangle(int n) {
		int i = 0, j = 0;
		int[][] a = new int[n][2 * n];
		for (i = 0; i < n; i++) {
			a[i][n - 1 - i] = 1;
			a[i][n - 1 + i] = 1;
		}// �߽縳��ֵ
		for (i = 1; i < n; i++)
			for (j = 1; j < 2 * n - 1; j++)
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j + 1];// ������Ǽ��㷽��
		for (i = 0; i < n; i++) {
			for (j = 0; j < 2 * n; j++) {
				if (a[i][j] != 0)
					System.out.print("\t" + a[i][j]);
				else
					System.out.print("\t");
			}// ���ض���ʽ���
			System.out.println();
		}
	}
}