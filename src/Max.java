public class Max {
	public static void main(String[] args) {
		String character = "ads3sl456789DF3456ld345AA";
		numstring(character);
	}
//�ҳ��ַ���������ִ�
	public static void numstring(String word) {
		int i = 0, j = 0, begin = 0, end = 0, max = 0, flag = 0;
		char a[] = word.toCharArray();
		String[] num = new String[99];
		while (i < a.length) {
			if (a[i] >= '0' && a[i] <= '9') {
				if (a[i + 1] >= '0' && a[i + 1] <= '9')
					i++;
				else {
					end = i;
					i++;
					num[j] = word.substring(begin, end + 1);
					j++;
				}
			} else {
				begin = i + 1;
				i++;
				continue;
			}
		}//���ַ����е����ִ�ѡ��
		for (i = 0; i < j; i++) {
			if (max <= num[i].length() + 1) {
				max = num[i].length() + 1;
				flag = i;
			}
		}// �ҳ����ִ��������־λ
		System.out.println(num[flag]);
	}
}