#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  int a[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      scanf("%d",&a[i][j]);
    }
  }
  int sm=0;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      if(i%2==0){
        sm+=a[i][j];
      }
      else if(j%2==0){
        sm+=a[i][j];
      }
    }
  }
  printf("Sum of boundaries is %d",sm);
} 