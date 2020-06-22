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
  int s=0;
  for(int i=0;i<m;i++){
    s=0;
    for(int j=0;j<n;j++){
      s+=a[j][i];
    }
    printf("The sum of column %d: %d\n",i+1,s);
  }
}