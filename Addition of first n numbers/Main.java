#include<stdio.h>
int fun(int);
int main(){
  int f;
  scanf("%d",&f);
  fun(f);
}
int s=0;
int fun(int f){
  s+=f;
  if(f>0){
    fun(f-1);
  }
  else
  {
    printf("%d",s);
  }
}