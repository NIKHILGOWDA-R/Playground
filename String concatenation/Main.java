#include<stdio.h>
int main()
{
  char a[10],b[10];
  gets(a);gets(b);
  strcat(a,b);
  printf("The concatenated string is %s",a);
}