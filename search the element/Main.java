#include<stdio.h>
int main()
{
  //fill your code
  int q;
  scanf("%d",&q);
  int i[q];
  for(int ii=0;ii<q;ii++){
    scanf("%d",&i[ii]);
}
  int r;
  int io=0;
  scanf("%d",&r);
  for(int j=0;j<q;j++){
    if(r==i[j]){
      printf("%d",r);
      io=1;
    break;}
  }
  if(!(io)){
   printf("%d",r);
  }
     }