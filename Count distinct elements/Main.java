#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b[a];
  for(int i=0;i<a;i++)
    scanf("%d",&b[i]);
  for(int i=0;i<a-1;i++){
    for(int j=0;i<a-j-1;j++){
      if(b[j]>b[j+1]){
        int swap=b[j+1];
        b[j+1]=b[j];
        b[j]=swap;
      }
    }
  }
  int xxx=0;
  for(int i=0;i<a;i++){
    if(b[i]==b[i+1]){
      continue;
    }
    xxx++;
}
  printf("There are %d distinct elements in the array.",xxx);
}