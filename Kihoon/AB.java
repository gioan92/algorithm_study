package feb21_27_newbie;

/*
  �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
  ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
  �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10) 
  �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
 */

import java.util.Scanner;

public class AB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int result = 0;

		for(int i=0; T>i; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result = a+b;
			System.out.println("Case #"+(i+1) + ": "+ result);
		}

	}
}
