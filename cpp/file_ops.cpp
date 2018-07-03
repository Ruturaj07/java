#include<iostream>
#include<fstream>
using namespace std;

int main(){
	ifstream in("info.txt");
	if(!in){
		cout<<"FILE CANT'T OPEN";	
	}
	
	string name;
	int roll_no,sub1,sub2,sub3;

	cout<<"First Student :"<<endl;
	in>>name>>roll_no>>sub1>>sub2>>sub3;
	cout<<"\t Name:"<<name<<"\n\t Roll No:"<<roll_no<<"\n\t Subject 1:"<<sub1<<"\n\t Subject 2:"<<sub2<<"\n\t Subject 1:"<<sub3<<endl;

	cout<<"Second Student :"<<endl;
	in>>name>>roll_no>>sub1>>sub2>>sub3;
	cout<<"\t Name:"<<name<<"\n\t Roll No:"<<roll_no<<"\n\t Subject 1:"<<sub1<<"\n\t Subject 2:"<<sub2<<"\n\t Subject 1:"<<sub3<<endl;;

	cout<<"Third Student :"<<endl;
	in>>name>>roll_no>>sub1>>sub2>>sub3;
	cout<<"\t Name:"<<name<<"\n\t Roll No:"<<roll_no<<"\n\t Subject 1:"<<sub1<<"\n\t Subject 2:"<<sub2<<"\n\t Subject 1:"<<sub3<<endl;
	
}
