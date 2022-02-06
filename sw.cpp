#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

map<int, int> C;
vector<int> A;

ll Ans;
int N;

void init() {
    for (int i = 1; i <= N; i++) {
        Ans += C[A[i]];
        C[A[i]]++;
    }
}

// O(lg (N+Q))
void query1(int i, int x) {
    // Pop
    C[A[i]]--;
    Ans -= C[A[i]];

    // Modify
    A[i] = x;

    // Push
    Ans += C[x];
    C[x]++;
}

// O(1)
ll query2() {
    return Ans;
}