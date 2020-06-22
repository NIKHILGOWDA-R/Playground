#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  if(a>0&&b>0)
    printf("Ist Quadrant");
  else if(a<0&&b>0)
    printf("IInd Quadrant");
  else if(a<0&&b<0)
    printf("IIIrd Quadrant");
  else
    printf("IVth Quadrant");
}
