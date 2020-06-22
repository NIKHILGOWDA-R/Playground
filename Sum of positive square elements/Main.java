#include<stdio.h>
int sumPositive(int a,int*aa);
int main()
{
  int p;
  int pp[4];
  for(int i=0;i<4;i++){
    scanf("%d",&pp[i]);
  }
  p=sumPositive(4,pp);
  printf("%d",p);
}
int sumPositive(int a,int*aa){
  int ss=0;
  for(int i=0;i<a;i++){
    float ii=sqrt((double)aa[i]);
    int iii=ii;
    if(iii==ii){
    ss+=(aa[i]);
    }
  }
    return ss;
}