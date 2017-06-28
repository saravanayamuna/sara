#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int i,j,len,k,a;
  scanf("%d",&len);
for( i=0;i<len;i++)
{
    for( j=0;j<len-i;j++)
    {

        printf("*");
    }

    printf(" ");
    for( k=j-1;k>=0;k--)
    {

        printf("*");
    }
    printf("\n");
}
}
