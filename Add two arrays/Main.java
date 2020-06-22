#include<stdio.h>
int* createarray(int); 
void getelements(int*,int); 
void arraysum(int*,int*,int*,int); 
int ii=0;
int s;
int main()
{
  
  scanf("%d",&s);
  int* p1=createarray(s);
  int* p2=createarray(s);
  int* p3=createarray(s);
  getelements(p1,s);
  getelements(p2,s);
  arraysum(p1,p2,p3,s);
}
int* createarray(int ss){
  if(ii==0)
  {static int arr1[100];ii++;return arr1;}
  if(ii==1)
  { static int arr2[100];ii++;return arr2;}
  if(ii==2)
  { static int arr3[100];return arr3;}
}
void getelements(int* a,int b){
  for(int i=0;i<b;i++){
    scanf("%d",&a[i]);
  }
}
void arraysum(int* a,int* b,int* c,int d){
  for(int i=0;i<d;i++){
    c[i]=a[i]+b[i];
    printf("%d ",c[i]);
  }
}