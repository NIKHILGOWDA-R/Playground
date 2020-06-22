#include<stdio.h>
int main()
{
  char divya[4],kavya[4];
  scanf("%s",&divya);
  scanf("%s",&kavya);
  if(strcmp(divya,kavya))
     printf("Strings are same");
  else
     printf("Strings are not same");
}