#include<stdio.h>
int main()
{
  int array[100], position, c, n;
   scanf("%d", &n);
   for (c = 0; c < n; c++)
      scanf("%d", &array[c]);
   scanf("%d", &position);

   if (position >= n+1)
      printf("Deletion not possible.\n");
   else
   {
      for (c = position - 1; c < n - 1; c++)
         array[c] = array[c+1];

      printf("Array after deletion is:\n");

      for (c = 0; c < n - 1; c++)
         printf("%d\n", array[c]);
   }

   return 0;
}