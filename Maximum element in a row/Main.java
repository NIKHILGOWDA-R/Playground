#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  int a[m][n];
  int s;
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      scanf("%d",&a[i][j]);
    }
  }

  for(int i=0;i<m;i++){
    int s[]={0,0,0};
    for(int j=0;j<n;j++){
      s[j]=a[i][j];

    }
    int x=s[0];
    int y=s[1];
    int z=s[2];
    if((x>y)&&(x>z))
      printf("%d\n",x);
    else if ((y>z)&&(y>x))
      printf("%d\n",y);
    else
      printf("%d\n",z);
  }


}