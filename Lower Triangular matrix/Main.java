#include<stdio.h>
int main()
{
  int m;
  scanf("%d",&m);
  int n=m;
  int a[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      scanf("%d",&a[i][j]);
    }
  }
  int f=0;
  for(int i=0;i<m;i++){
    for(int j=i+1;j<n;j++){
      if((a[i][j])!=0){
        f=1;
      }
    }
  }
    if(f)
      printf("Not Lower triangular matrix");
    else
      printf("Lower triangular matrix"); 
} 