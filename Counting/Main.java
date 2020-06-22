#include<stdio.h>
int main()
{
  char s[30];
  int len=0;
  gets(s);
  while(s[len]!='\0')
    len++;
  int i,vc=0,cc=0,wsc=0,dc=0,sc=0;
  for(i=0;i<len;i++)
  {
    if(s[i]=='a'||s[i]=='A'||s[i]=='e'||s[i]=='E'||s[i]=='i'||s[i]=='I'||s[i]=='o'||s[i]=='O'||s[i]=='u'||s[i]=='U')
      vc++;
    else if((s[i]>='a' && s[i]<='z')||(s[i]>='A' && s[i]<='Z'))
      cc++;
    else if(s[i]==' ') 
      wsc++;
    else if(s[i]>='0' && s[i]<='9')
      dc++;
    else
      sc++;
  }
  printf("Vowels:%d\nConsonants:%d\nWhite Spaces:%d\nDigits:%d\nSymbols:%d\n",vc,cc,wsc,dc,sc);
  return 0;
}