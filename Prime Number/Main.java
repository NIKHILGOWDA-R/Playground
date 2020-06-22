#include<stdio.h>
int fun(int,int);
int main(){
  int m;
  scanf("%d",&m);
  int u=fun(m,m/2);
  if(u==1){
    printf("%d is a prime number",m);
  }else{
    printf("%d is not a prime number",m);
  }
}
int fun(int m,int n){
  if(n==1){
    return 1;
  }
  else{
    if(m%n==0){
      return 0;
    }else{
      return fun(m,n-1);
    }
  }
}

