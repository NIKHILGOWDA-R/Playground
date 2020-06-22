#include<stdio.h>
int main()
{ 
 int n;
 int a[n],b[n],i,sum1=0,sum2=0;
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
   scanf("%d",&a[i]);
   scanf("%d",&b[i]);
 }
  for(i=0;i<n;i++)
  {
    sum1=sum1+a[i];
    sum2=sum2+b[i];
  }
  if(sum1==sum2)
    printf("Same");
  else
    printf("Not Same");
}