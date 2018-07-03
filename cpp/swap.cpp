#include<iostream>

using namespace std;

int main(){
int a,b,c;
cout<<"Enter two number";
cin>>a>>b;
c=b;
b=a;
a=c;
cout<<"After swap a = "<<a<<" b = "<<b;
}
