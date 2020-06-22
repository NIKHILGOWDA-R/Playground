#include<stdio.h>
int main()
{
  char s[100],t[100];
  scanf("%s",s);
  int len=0;
  while(s[len]!='\0')
    len++;
  int i,j=0;
  for(i=0;i<len;i++)
  {
    if(s[i] >='a' && s[i] <='z')
    {
      t[j]=s[i];
      j++;
    }
  }
  printf("%s",t);
  return 0;
}