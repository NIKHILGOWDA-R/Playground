#include<stdio.h>
struct employee
{
  int id,bs,hra,da,ma,pf,ins;
  float gs,ns;
  char n[20];
};
int main()
{
  int n,i;
  printf("Enter the number of employees:\n");
  scanf("%d",&n);
  printf("Enter your input for every employee:\n");
  struct employee e[n];
  for(i=0;i<n;i++)
  {
    printf("Employee ID:\n");
    scanf("%d",&e[i].id);
    printf("Employee Name:\n");
    scanf("%s",e[i].n);
    printf("Basic salary,HRA:\n");
    scanf("%d%d",&e[i].bs,&e[i].hra);
    printf("DA,Medical Allowance:\n");
    scanf("%d%d",&e[i].da,&e[i].ma);
    printf("PF and Insurance:");
    scanf("%d%d",&e[i].pf,&e[i].ins);
    e[i].gs=(e[i].bs+e[i].hra+e[i].da+e[i].ma)*12;
    e[i].ns=e[i].gs-(e[i].pf+e[i].ins)*12;
  }
  printf("Enter employee ID to get payslip:\n");
  int eid;
  scanf("%d",&eid);
  for(i=0;i<n;i++)
  {
    if(eid==e[i].id)
      break;
  }
  printf("Salary slip of %s:\n",e[i].n);
  printf("Employee ID:%d\n",e[i].id);
  printf("Basic Salary:%d\n",e[i].bs);
  printf("House Rent Allowance:%d\n",e[i].hra);
  printf("Dearness Allowance:%d\n",e[i].da);
  printf("Medical Allowance:%d\n",e[i].ma);
  printf("Gross Salary:%.2f Rupees\n",e[i].gs);
  printf("Deductions:\n");
  printf("Provident fund:%d\n",e[i].pf);
  printf("Insurance:%d\n",e[i].ins);
  printf("Net Salary:%.2f Rupees",e[i].ns);
  return 0;
}