#include<iostream>
#include<string>
using namespace std;

int main(){
string str;
cout<<"Enter String :";
cin>>str;
int l = str.length();


string str_rev;
int count = 0;

for(int i =l-1;i>=0;i--){
	str_rev[count] = str[i];
	count++;	
} 
cout<<"Reverse of string is :";
for(int z=0;z<l;z++){
cout<<str_rev[z];
}
}
