#include<stdio.h>
int main()
{
  char e[10];
  gets(e);
  int j=0;
  printf("String in uppercase is ");
  while(e[j]){
    char ch=e[j];
    putchar(toupper(ch));
    j++;
  }
  
}