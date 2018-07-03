#include<iostream>
using namespace std;

class matrix{
	int A[3][3],B[3][3];

	public:
		void getData(){
			cout<<"Enter first Matrix :";
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					cin>>A[i][j];
				}	
			}
			
			cout<<"First Matrix:"<<endl;
			printData(A);
		
		}
		
		void printData(int temp[3][3]){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					cout<<temp[i][j]<<"    ";
				}	
				cout<<endl;
			}
		}
		
		void trans(){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					B[i][j] = A[j][i];
				}	
			}
			cout<<"Transform of metrix:"<<endl;
			printData(B);
		}
		

};

int main(){
	matrix m;
	m.getData();	
	m.trans();
}
