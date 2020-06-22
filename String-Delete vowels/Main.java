#include<stdio.h>
int checkvowel(char c)
{
  if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
    return 1;
  else
    return 0;
}
int main()
{
  int len=0,d=0,i;
  char k[10],p[10];
  scanf("%s",p);
  while(p[len]!='\0')
    len++;
  for(i=0;i<len;i++)
  {
    if(checkvowel(p[i])==0)
    {
      k[d]=p[i];
      d++;
    }
  }
  k[d] ='\0';
  printf("%s",k);
  return 0;
    
  
}