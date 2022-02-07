#include<iostream>
using namespace std;

void fun();

int main(int args, const char* argv[]) {

	int c;
	cin >> c;
	for (int i = 0; i < c; i++) {
		void fun();
	}
	return 0;

}
void fun() {

	int N;
	cin >> N;
	int* arr= new int[N];
	double avg = 0;
	for (int i = 0; i < N; i++) {

		avg += arr[i];

	}
	avg = avg / N;
	double count = 0;
	for (int i = 0; i < N; i++) {

		if (arr[i] > avg) {
			count++;
		}
	}
	double result = (count / N) * 100;
	cout << fixed;
	cout.precision(3);
	cout << result << "%\n";
	delete[] arr;

}