#include<stdio.h>
union employee
{
  char n[20];
  int sal;
};
int main()
{
  union employee e;
  printf("Enter the Employee details\nEnter the Employee name\n");
  scanf("%s",e.n);
  printf("Enter the Employee salary\n\n");
  scanf("%d",&e.sal);
  printf("Employee Details\n");
  printf("%s  %d",e.n,e.sal);
  return 0;
}