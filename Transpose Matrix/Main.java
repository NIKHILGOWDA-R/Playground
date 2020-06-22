#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d",&m);
  n=m;
  int a[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      scanf("%d",&a[i][j]);
      printf("%d ",a[i][j]);
    }
    printf("\n");
  }
  printf("Transpose matrix is :\n");
  int a2[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      a2[i][j]=a[j][i];
      printf("%d ",a2[i][j]);
    }
    printf("\n");
  }
  return 0;
}