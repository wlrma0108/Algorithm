#include<iostream>
using namespace std;

/*
int score(int *Geer) {
	int answer=0;
	int *zero = 0;
	for (int i = 0; i < 4; i++) {
	if (Geer[i][zero] == 1) {
		answer += pow(2,i);
	}
}	
	cout << answer;
	return answer;
	
}
*/
int recurtion_Geer(int Geer_num, int way) {
	int Geer[4][8];
	if (Geer_num > 3 || Geer_num < 0) {
	
	}
	else if(1){
		if (Geer[Geer_num][2] == Geer[Geer_num + 1][6]) {

		}
		else if (Geer[Geer_num][2] == !Geer[Geer_num + 1][6]) {
			recurtion_Geer(Geer_num + 1, way * -1);
		}

		if (Geer[Geer_num][6] == Geer[Geer_num - 1][2]) {

		}
		else if (Geer[Geer_num][6] == !Geer[Geer_num - 1][2]) {
			recurtion_Geer(Geer_num - 1, way * -1);
		}
		if (way == 1) {
			for (int i = 0; i < 7; i++) {
				int tmp = 0;
				Geer[Geer_num][7] = tmp;
				Geer[Geer_num][i + 1] = Geer[Geer_num][i];
				Geer[Geer_num][0] = tmp;

			}
		}
		else if (way == -1) {
			for (int i = 1; i < 8; i++) {
				int tmp = 0;
				Geer[Geer_num][0] = tmp;
				Geer[Geer_num][i - 1] = Geer[Geer_num][i];
				Geer[Geer_num][7] = tmp;

			}
			return 0;
		}
		return 0;
	}
	return 0;
}

int main(void) {
	int chance; //k
	int way; // 시계 ||반시계
	int Geer[4][8];
	int Geer_num;
	int answer=0;

	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 8; j++) {
			cin >> Geer[i][j];
		}
	}
	cin >> chance;
	for (int i = 0; i < chance; i++) {
		cin >> Geer_num;
		cin >> way;
		recurtion_Geer(Geer_num, way);
	}
	//score(*Geer);
	for (int i = 0; i < 4; i++) {
		answer=+pow(2,Geer[i][0]);
	}
	cout << answer;
	
}
