#include<stdio.h>
int main()
{
  int r;
  scanf("%d",&r);
  int a[r],b[r];
  for(int i=0;i<r;i++){
    scanf("%d",&a[i]);
  }
  int n=r;
  b[0]=1;
  for(int i=1;i<n;i++){
    b[i]=1;
    for(int j=i-1;(j>=0)&&(a[i]>a[j]);j--){
      b[i]+=1;
    }
  }
for(int i=0;i<r;i++)
  printf("%d\n",b[i]);
 
}