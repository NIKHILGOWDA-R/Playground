#include<stdio.h>
int main()
{
  int e;
  scanf("%d",&e);
  int a[e];
  for(int i=0;i<e;i++){
    scanf("%d",&a[i]);
  }
  int b[e];
  for(int i=0;i<e;i++){
    scanf("%d",&b[i]);
  }
  int n=e;
  for(int i=0;i<n-1;i++){
    for(int j=0;j<n-j-1;j++){
      if(a[j]>a[j+1]){
        int swap=a[j+1];
        a[j+1]=a[j];
        a[j]=swap;
      }
    }
  }
  for(int i=0;i<e-1;i++){
    for(int j=0;j<e-i-1;j++){
      if(b[j+1]>b[j]){
        int swap=b[j+1];
        b[j+1]=b[j];
        b[j]=swap;
      }
    }
  }
  int sum=0;
  for(int i=0;i<e;i++){
  sum+=a[i]*b[i];
}
  printf("%d",sum);
}