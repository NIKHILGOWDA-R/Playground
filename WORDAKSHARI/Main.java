#include<stdio.h>
#include<string.h>
int main()
{
  int i,n=0;
  char s[20][20];
  for(i=0;i<10;i++)
  {
    gets(s[i]);
    n++;
    if(!strcmp(s[i],"####"))
      break;
  }
  printf("%s\n",s[0]);
  for(i=0;i<n;i++)
  {
    if(s[i][strlen(s[i] )-1]==s[i+1][0])
      printf("%s\n",s[i+1]);
  }
  return 0;
}