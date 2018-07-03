#include<iostream>
#include<string>
using namespace std;
string str_new;
bool match(char c, int count){
	bool flag = false;
	for(int i=0;i<=count;i++){
	
		if(c==str_new[i]){
			flag = true;
			break;
		}
	}
	return flag;
}

int main(){
string str;
cout<<"Enter String :";
cin>>str;
int l = str.length();



int count = 0;

for(int i =0;i<l;i++){
	bool aaa = match(str[i],count);
	if(aaa){
		// do nothing	
		
	}
	else{
	str_new[count] = str[i];
	count++;
	}	
} 
cout<<"New string is :";
for(int z=0;z<l;z++){
cout<<str_new[z];
}
}
