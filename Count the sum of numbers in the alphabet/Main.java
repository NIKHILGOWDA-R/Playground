#include<stdio.h>
int digit(char ch)
{
  if(ch>='0' && ch<='9')
    return 1;
  else
    return 0;
}
int main()
{
  char s[20];
  scanf("%s",s);
  int i,len=0,rev=0,sum=0;
  while(s[len]!='\0')
    len++;
  for(i=0;i<len;i++)
  {
    if(digit(s[i]))
    {
      while(digit(s[i]))
      {
        rev=rev*10 + (s[i]-48);
        i++;
      }
    }
    sum=sum+rev;
    rev=0;
  }

    printf("%d",sum);
    return 0;
         
}