#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d%d",&n,&m);
  int t[n];
  int sum=0;
  for(int i=0;i<n;i++){
    scanf("%d",&t[i]);
    sum+=t[i];
}
  int i=1;
 while(1){
   if(sum<=(m*i)){
     printf("%d",i);
     break;
   }
   i++;
 }
  
}