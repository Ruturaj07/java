#include<iostream>
using namespace std;

int main(){
int n;
cout<<"Enter number";
cin>>n;
int fact = 1;
for(int i=n;i>0;i--){
	fact = fact* i;
}
cout<<"factorial of "<<n<<" is "<<fact<<endl;
}
