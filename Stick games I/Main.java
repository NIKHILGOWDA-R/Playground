#include<stdio.h>
int main()
{
  int a,b,res;
  scanf("%d %d",&a,&b);
  if(a>b)
    res=a;
  else
    res=b;
  if(res%2==0)
    printf("Mani Iyer\n");
  else
    printf("Arun Gupta");
  

}