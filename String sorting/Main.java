#include<stdio.h>
int main()
{
  char s[3];
  for(int i=0;i<3;i++){
    scanf("%c",&s[i]);
  }
  for(int i=0;i<3;i++){
    for(int j=i;j<3;j++){
      if(s[j]<s[i]){
        int t=s[j];
        s[j]=s[i];
        s[i]=t;
      }
    }
  }
  printf("The sorted string is ");
  for(int i=0;i<3;i++){
    printf("%c",s[i]);
  }

}