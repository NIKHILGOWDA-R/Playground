#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  int a1[m][n],a2[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      scanf("%d",&a1[i][j]);
    }
  }
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      scanf("%d",&a2[i][j]);
    }
  }
  int a3[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      a3[i][j]=a1[i][j]+a2[i][j];
    }
  }
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
     printf("%d ",a3[i][j]);
    }
    printf("\n");
  }
return "AMEN";
}
