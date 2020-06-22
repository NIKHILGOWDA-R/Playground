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
    for(j=i+1;j<len;j++)
    {
      if(s[i]>s[j])
      {
        t=s[i];
        s[i]=s[j];
        s[j]=t;
      }
    }
  }
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
      printf("%c %d\n",s[i],count);
    }
  }
          
  return 0;
}