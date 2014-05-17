public class HexToDec1 {
	public static void main(String[] args) {
		String word = "ABCD";
		System.out.println("16进制：" + word);
		char b[] = word.toCharArray();
		num(b);
	}

	public static void num(char a[]) {
		int i = 0, num = 0;
		int[] flag = new int[a.length];
		while (i < a.length) {
			switch (a[i]) {
			case '1':
				flag[i] = 1;
				break;
			case '2':
				flag[i] = 2;
				break;
			case '3':
				flag[i] = 3;
				break;
			case '4':
				flag[i] = 4;
				break;
			case '5':
				flag[i] = 5;
				break;
			case '6':
				flag[i] = 6;
				break;
			case '7':
				flag[i] = 7;
				break;
			case '8':
				flag[i] = 8;
				break;
			case '9':
				flag[i] = 9;
				break;
			case '0':
				flag[i] = 0;
				break;
			case 'A':
				flag[i] = 10;
				break;
			case 'B':
				flag[i] = 11;
				break;
			case 'C':
				flag[i] = 12;
				break;
			case 'D':
				flag[i] = 13;
				break;
			case 'E':
				flag[i] = 14;
				break;
			case 'F':
				flag[i] = 15;
				break;
			}
			i++;
		}
		for (i = 0; i < a.length; i++)
			num = num + flag[i] * (int) (Math.pow(16, i));//先转化为10进制，再输出16进制
		for (i = 1; i <= 4 * a.length; i++) {
			System.out.print(num % 2);
			num = num / 2;
		}
	}
}
