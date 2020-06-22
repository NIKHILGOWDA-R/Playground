#include<stdio.h>
int main(){
  char r[3];
  gets(r);
  int o=3;
  int oo=0;
  char e[1];
  while(o>0){
    e[oo++]=r[o--];
  }
  if(strcmp(e,r))
    printf("Palindrome");
  else
    printf("Not Palindrome");
}