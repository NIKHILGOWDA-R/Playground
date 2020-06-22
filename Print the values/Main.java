#include<stdio.h>
int main()
{
  int n;
  int arr[n];
  int i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
    }
  for(i=0;i<n;i++)
  {
    printf("%d\n",arr[i]);
  }
}