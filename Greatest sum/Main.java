#include<stdio.h>
int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  int a[m][n];
  printf("Sum of rows is ");
  int e[m];
  for(int i=0;i<m;i++){
    int s=0;
    for(int j=0;j<n;j++){
      scanf("%d",&a[i][j]);
      s+=a[i][j];
    }
    printf("%d ",s);
    e[i]=s;
  }
  if((e[0]>e[1])&&(e[0]>e[2])){
    printf("\nRow 1 has maximum sum\n");
  }
  else if ((e[0]<e[1])&&(e[2]<e[1])){
    printf("\nRow 2 has maximum sum\n");
  }    
   else{
     printf("\nRow 3 has maximum sum\n");
   }
    printf("Sum of columns is ");
  int f[m];
   for(int i=0;i<m;i++){
    int s=0;
    for(int j=0;j<n;j++){
      scanf("%d",&a[i][j]);
      s+=a[j][i];
    }
    printf("%d ",s);
    f[i]=s;
  }
  if((f[0]>f[1])&&(f[0]>f[2])){
    printf("\nColumn 1 has maximum sum\n");
  }
  else if ((f[0]<f[1])&&(f[2]<f[1])){
    printf("\nColumn 2 has maximum sum\n");
  }    
   else{
     printf("\nColumn 3 has maximum sum\n");
   }
 return 0;
}