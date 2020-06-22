#include<stdio.h>
int main()
{
  int n,s;
  scanf("%d %d",&n,&s);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
      if(a[j]>a[j+1]){
        int swp=a[j+1];
        a[j+1]=a[j];
        a[j]=swp;
      }
    }
  }
  int sum=0;int ii=0;
  for(int i=0;i<n-1;i++){
    sum+=a[i];
    if(sum>s||a[i]>s){
      printf("NO");ii=1;break;
  }
}
  if(ii==0){
    printf("YES");
  }
}