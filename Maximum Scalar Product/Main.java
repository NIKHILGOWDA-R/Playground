#include<stdio.h>
int* createarray(int);
int getelement(int*,int); 
int ascending(int*,int); 
int maxscalar(int*,int*,int);
int ini=0;
int main()
{
  int xx;
  scanf("%d",&xx);
  int* p1=createarray(xx);
  int* p2=createarray(xx);
  getelement(p1,xx);getelement(p2,xx);
  ascending(p1,xx);ascending(p2,xx);
  int rep=maxscalar(p1,p2,xx);
  printf("%d",rep);
}
int* createarray(int x){
  if(ini==0){
    static int arr1[100];ini++;return arr1;
  }
  if(ini==1){
    static int arr2[100];return arr2;
  }
}
int getelement(int* v,int vv){
  for(int i=0;i<vv;i++){
    scanf("%d",&v[i]);
  }
}
int ascending(int* u,int v){
  for(int i=0;i<v-1;i++){
    for(int z=0;z<v-i-1;z++){
      if(u[z]>u[z+1]){
        int swap=u[z+1];
        u[z+1]=u[z];
        u[z]=swap;
      }
    }
  }
}
int maxscalar(int* a1,int* a2,int a){
  int xum=0;
  for(int i=0;i<a;i++){
    xum+=a1[i]*a2[i];
  }
  return xum;
}