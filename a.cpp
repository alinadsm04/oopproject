#include <iostream>
#include <deque>
#include <vector>
using namespace std;

deque<int> counter(int x){
    deque <int> d;
    d.push_back(x);
    int j = 1;
    while(d.size() != x){
        d.push_front(x - j);
        int i = d.front();
        while( i > 0){
            int temp = d.back();
            d.pop_back();
            d.push_front(temp);
            i--;
        }
        j++;
    }
    return d;
}
int main(){
    int n; cin >> n;
    vector <deque<int>> v;
    for (int i = 0; i < n; i++){
        int x; cin >> x;
        v.push_back(counter(x));
    }
    for (int i = 0; i < v.size(); i++){
        while (!v[i].empty()){
            cout<<v[i].front()<<" ";
            v[i].pop_front();
        }
        cout<<endl;

    }
}

//test