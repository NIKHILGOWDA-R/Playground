#include<stdio.h>
int numb(int* a,int n,int l){
  if(n==0)
    return l;
  if(n>0){
    if (a[n]>l){
      l=a[n];
    }
    return numb(a,n-1,l);
  }
}
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  printf("%d",numb(a,n-1,65));
}