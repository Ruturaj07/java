#include<iostream>

using namespace std;

int main(){
int a,b;
cout<<"Enter two number";
cin>>a>>b;

a=a-b;
b=b+a;
a=b-a;
cout<<"After swap a = "<<a<<" b = "<<b;
}
