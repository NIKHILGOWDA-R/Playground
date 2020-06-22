#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  int a[m][n];
  for(int i=0;i<m;i++){
    int s=0;
    for(int j=0;j<n;j++){
    scanf("%d",&a[i][j]);
      s+=a[i][j];
  }
    printf("The sum of row %d: %d\n",i+1,s);
} 
}