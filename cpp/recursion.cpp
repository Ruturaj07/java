
#include<iostream>
using namespace std;
int fact(int);

int main(){
int n;
cout<<"Enter number :";
cin>>n;
cout<<"Factorial of "<<n<<" is "<<fact(n)<<endl;
}

int fact(int n){
	int res=1;
	if(n>0){
		res = n*fact(n-1);	
	}
	else{
		return res;
	}
}


