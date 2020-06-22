#include<stdio.h>
int main()
{
  char s[10],t;
  int count, i,j,len=0;
  scanf("%s",s);
  while(s[len]!='\0')
    len++;
  for(i=0;i<len;i++)
  {
    count=1;
    if(s[i])
    {
      for(j=i+1;j<len;j++)
      {
        if(s[i] ==s[j])
        {
          count++;
          s[j]='\0';
        }
      }
      if(count==1)
      {
        printf("%c\n",s[i]);
        return 0;
      }
    }
  }
}