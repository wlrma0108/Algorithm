#include<iostream>
using namespace std;



/*백준 사다리 타기 2020253019_김호중
아이디어 자체는 간단하다 시작 배열 A, B, C, D, E, F, G, H가 ?라인을 만나기 전까지 사다리 연산을 진행하고 같은 원리로 마무리 배열로부터 역으로 사다리 연산을 ?라인 까지 계산한다. 
사다리 연산이란 ladder[i]에서 i에 해당하는 원소가 -일 경우 시작 문자열 배열 start의 i번째 원소와 i+1번째 원소를 스왑해준다. 
예를 들어 0번째 사다리배열의 원소가 -일경우 시작 문자열의 0과 1번째 값을 바꿔준다. Temp사용
?라인에서 시작문자열과 끝문자열이 사다리연산을 통해 만나기 직전상황이다. 이때 시작 문자열과 끝문자열의 i번째 원소를 각각 비교해준다. 
Startarr[i]값과 endarr[i]의 값이 같다면 정답 arr[i]==*이 되며 start[i]==end[i+1]값을 만족하고 start[i+1]==end[i]라면 answer[i]==-이다. 
*/


int main(void) {

	int unknown;//????라인
	int PeopleNum;//k
	int size;//n
	char ladder[1000][30];
	char start[100];
	char end[100];
	char answer[100];
	cin >> PeopleNum;
	cin >> size;
	// 문자열 입력 받기
	for (int i = 0; i < PeopleNum; i++) {
		start[i] = 'A'+1;
	}
	for (int i = 0; i < PeopleNum; i++) {
		cin >> end[i];
	}
	for (int i = 0; i < size; i++) {
		for (int j = 0; j < PeopleNum-1; j++) {
			cin >> ladder[i][j];
			if (ladder[i][j] == '?') {
				unknown = i;
				break;
			}
		}
	}
	/*
	//그냥 while 쓸걸
    // unknown 찾기
	for (int i = 0; i++; i < 1000) {
		for(int j=0; j<size; j){
			if (ladder[i][j] == '?') {
				unknown = i;
				break;
			}
		}
	}
	*/
	//위에서 아래로 연산
	for (int i = 0; i < unknown; i++) {
		for (int j=0; j < PeopleNum - 1; j++) {
			if (ladder[i][j] ==! '*'  ) {
				char tmp=0;
				start[j] = tmp;
				start[j] = start[j + 1];
				start[j + 1] = tmp;
			}
		}
	}
	//아래에서 위로
	for(int i = size-1; i > unknown; i--) {
		for (int j = 0; j < PeopleNum - 1; j++) {
			if(ladder[i][j] ==! '*') {
				char tmp = 0;;
				end[j] = tmp;
				end[j] = end[j + 1];
				end[j + 1] = tmp;
			}
		}
	}
	for(int i=0; i<PeopleNum-1; i++){
		if (start[i] = end[i + 1] && start[i + 1] == end[i]) {
			answer[i] = '-';

		}
		else if(start[i]==end[i]) {
			answer[i] = '*';
		}
		else {
			answer[i] = 'x';
		}
		}

	for (int i = 0; i < PeopleNum-1; i++) {
		cout << answer[i];
	}

}
