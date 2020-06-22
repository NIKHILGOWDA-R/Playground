#include<stdio.h>
int main()
{
  char w[5],y[5];
  scanf("%s",&w);
  strcpy(y,w);
  printf("The copied string is %s.",y);
}