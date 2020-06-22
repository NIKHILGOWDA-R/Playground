#include<stdio.h>
int main(){
  char r[10];
  gets(r);
  printf("String with lowercase is ");
  int y=0;
  while(r[y]){
    char t=r[y++];
    putchar(tolower(t));
  }
}