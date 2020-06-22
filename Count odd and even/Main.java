#include<stdio.h>
int main()
{
  int n,i,odd=0,even=0;
  int arr[n];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<n;i++)
  {
    if(arr[i]%2==0)
      even++;
    else
      odd++;
  }
  printf("Odd: %d",odd );
  printf("\nEven: %d",even);
}