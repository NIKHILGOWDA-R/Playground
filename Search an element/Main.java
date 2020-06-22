#include<stdio.h>
int main()
{
  	int arr[10], Size, i, Search, Flag;
  	scanf("%d",&Size);
  	for(i = 0; i < Size; i++)
   	{
   	 	scanf("%d",&arr[i]);
    }
  	scanf("%d",&Search);      
    Flag = 0;
  	for(i = 0; i < Size; i++)
   	{
   		if(arr[i] == Search)
     	{
       		Flag = 1;
       		break;
	 	}   
   	}
    if(Flag == 1)
  	{
  		printf("%d is present in the array", Search);
	}
	else
    {
		printf("%d is not present in the array", Search);
	}	
  	return 0;
}