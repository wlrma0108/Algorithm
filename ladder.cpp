#include<iostream>
using namespace std;



/*���� ��ٸ� Ÿ�� 2020253019_��ȣ��
���̵�� ��ü�� �����ϴ� ���� �迭 A, B, C, D, E, F, G, H�� ?������ ������ ������ ��ٸ� ������ �����ϰ� ���� ������ ������ �迭�κ��� ������ ��ٸ� ������ ?���� ���� ����Ѵ�. 
��ٸ� �����̶� ladder[i]���� i�� �ش��ϴ� ���Ұ� -�� ��� ���� ���ڿ� �迭 start�� i��° ���ҿ� i+1��° ���Ҹ� �������ش�. 
���� ��� 0��° ��ٸ��迭�� ���Ұ� -�ϰ�� ���� ���ڿ��� 0�� 1��° ���� �ٲ��ش�. Temp���
?���ο��� ���۹��ڿ��� �����ڿ��� ��ٸ������� ���� ������ ������Ȳ�̴�. �̶� ���� ���ڿ��� �����ڿ��� i��° ���Ҹ� ���� �����ش�. 
Startarr[i]���� endarr[i]�� ���� ���ٸ� ���� arr[i]==*�� �Ǹ� start[i]==end[i+1]���� �����ϰ� start[i+1]==end[i]��� answer[i]==-�̴�. 
*/


int main(void) {

	int unknown;//????����
	int PeopleNum;//k
	int size;//n
	char ladder[1000][1000];
	string start;
	string end;
	string answer;
	cin >> PeopleNum;
	cin >> size;
	// ���ڿ� �Է� �ޱ�

	//�׳� while ����
    // unknown ã��
	for (int i = 0; i++; i < 100000) {
		int j;
		if (ladder[i][j] == '?') {
			unknown == i;
			break;
		}
	}
	//������ �Ʒ��� ����
	for (int i = 0; i < unknown; i++) {
		for (int j=0; j < PeopleNum - 1; j++) {
			if (ladder[i][j] == '-'  ) {
				char tmp;
				start[j] == tmp;
				start[j] == start[j + 1];
				start[j + 1] == tmp;
			}
		}
	}
	//�Ʒ����� ����
	for (int i = size; i < unknown; i--) {
		for (int j = 0; j < PeopleNum - 1; j++) {
			if (ladder[i][j] == '-') {
				char tmp;
				end[j] == tmp;
				end[j] == end[j + 1];
				end[j + 1] == tmp;
			}
		}
	}
	for(int i=0; i<PeopleNum; i++){
		if (start[i] == end[i + 1] && start[i + 1] == end[i]) {
			answer[i] == '- ';

		}
		else {
			answer[i] == '*';
		}
		}
	for (int i = 0; i < PeopleNum; i++) {
		cout << answer[i];
	}

}
