#include<iostream>
using namespace std;

class matrix{
	int A[3][3],B[3][3],ADD[3][3],SUB[3][3],MULT[3][3];

	public:
		void getData(){
			cout<<"Enter first Matrix :";
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					cin>>A[i][j];
				}	
			}
			
			cout<<"Enter second Matrix :";
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					cin>>B[i][j];
				}	
			}
			
			cout<<"First Matrix:"<<endl;
			printData(A);
			
			cout<<"Second Matrix:"<<endl;
			printData(B);	
		}
		
		void printData(int temp[3][3]){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					cout<<temp[i][j]<<"    ";
				}	
				cout<<endl;
			}
		}
		
		void add(){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					ADD[i][j] = A[i][j]+B[i][j];
				}	
			}
			cout<<"Addition of metrices:"<<endl;
			printData(ADD);
		}
		
		void sub(){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					SUB[i][j] = A[i][j]-B[i][j];
				}	
			}
			cout<<"Substraction of metrices:"<<endl;
			printData(SUB);
		}
		
		void mult(){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					int sum = 0;
					for(int k=0;k<3;k++){
						sum = sum + (A[j][k]*B[k][j]);
					}
					MULT[i][j]=sum;
				}	
			}
			cout<<"Multiplication of metrices:"<<endl;
			printData(MULT);
		}
		
	

};

int main(){
	matrix m;
	m.getData();	
	m.add();
	m.sub();
	m.mult();
}
