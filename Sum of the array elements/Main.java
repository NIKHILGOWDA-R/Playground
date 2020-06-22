#include<stdio.h>
int sum(int* a,int b,int n){
  if(n>=0){
  b+=a[n];
  return sum(a,b,n-1);
  }
  if(n<0){
    return b;
  }
}
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i =0;i<n;i++)
    scanf("%d",&a[i]);
  printf("%d",sum(a,0,n-1));
}