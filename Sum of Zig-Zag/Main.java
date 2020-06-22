#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  int a[m][n];
  int b[]={0,0,0};
  for(int i=0;i<m;i++){
	for(int j=0;j<n;j++){
      scanf("%d",&a[i][j]);
      b[i]+=a[i][j];
    }
  }
  printf("Sum of Zig-Zag pattern is %d",b[0]+a[1][1]+b[2]);
}