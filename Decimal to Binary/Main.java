#include<stdio.h>
int convert(int d){
  if(d==0)
    return 0;
  else
    return d%2 + 10*convert(d/2);
}
int main(){
  int d,b;
  scanf("%d",&d);
  b=convert(d);
  printf("%d",b);
}