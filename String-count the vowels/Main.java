#include<stdio.h>
int main()
{
  char q[10];
  gets(q);
  int i=0;
  int vo=0;
  while(q[i]!='\0'){
    if((q[i]=='a')||(q[i]=='A')||(q[i]=='e')||(q[i]=='E')||(q[i]=='i')||(q[i]=='I')||(q[i]=='o')||(q[i]=='O')||(q[i]=='u')||(q[i]=='U')){
      vo++;
    }
    i++;
  }
  printf("Number of vowels: %d",vo);
}