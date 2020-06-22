#include<stdio.h>
struct employee
{
  char n[20],d[20];
  int id,age;
  int sal;
}e;
int main()
{
  printf("Enter name:\n");
  scanf("%s",e.n);
  printf("Enter ID:\n");
  scanf("%d",&e.id);
  printf("Enter age:\n");
  scanf("%d",&e.age);
  printf("Enter designation:\n");
  scanf("%s",e.d);
  printf("Enter Salary:\n");
  scanf("%d",&e.sal);
  printf("Employee Details\nName of the Employee:%s\nID of the Employee:%d\nAge of the Employee:%d\nDesignation of the employee:%s\nSalary of the Employee:%d",e.n,e.id,e.age,e.d,e.sal);
  return 0 ;
}