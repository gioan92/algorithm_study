package feb21_27_newbie;

/*
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.

ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
*/
//�Ѽ� ������� �� ���� Ǯ�� ���鼭 ��

import java.util.Scanner;

public class hansu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
			if(N<100) {
				cnt=N;
			}
			else{
				cnt =99;
				for(int i=100; i<=N; i++) {
					int hun = i/100; 
					int ten = (i/10) % 10;
					int one = i -( (hun*100) + (ten*10));
					
					if(hun-ten == ten-one) {
						cnt++;
					}
				}
			}
		
			System.out.println(cnt);
		}
}

