#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int i,j,len,k,a;
  char ch[40];
gets(ch);
len=strlen(ch);
for( i=0;i<len;i++)
{
    for( j=0;j<len-i;j++)
    {

        printf("%c",ch[j]);
    }
    for(a=0;a<i;a++)
    {
    printf(" ");
    }
    for( k=j-1;k>=0;k--)
    {

        printf("%c",ch[k]);
    }
    printf("\n");
}
}
