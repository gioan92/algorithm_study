# 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
# 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때,
# 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
# 입력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
# 출력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

N = int(input());
cnt = 0;

if N < 100:
    cnt = N;
elif N < 111:
    cnt = 99;
elif N < 1000:
# 백의 자리 int(N / 100)
# 십의 자리 (int(N / 10) % 10)
# 일의 자리 (N % 10)
    cnt = 99;
    for i in range(111, N + 1):
        if (int(i / 100) - (int(i / 10) % 10)) == ((int(i / 10) % 10) - (i % 10)):
            cnt += 1;
            #print(i, end = ' ');
            #print(cnt, end = ' ');
else:
    cnt = 144;
print(cnt);

