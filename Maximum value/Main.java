#include<stdio.h>
int main()
{
 int n,i,max=0;
 int arr[n];
 scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d\n",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    if(max<arr[i])
      max=arr[i];
  }
  printf("%d",max);
}