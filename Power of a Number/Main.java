#include<stdio.h>

int power(int n,int p){
  if(p==0)
    return 1;
  else
    return n*power(n,--p);
}

int main(){
  int n,p;
  scanf("%d%d",&n,&p);
  printf("%d",power(n,p));
}