#include<stdio.h>
#include<string.h>
char de[21];
char * defangIPaddr(char * address)
{
    int len = strlen(address);
    int i=0;
	int j=0;
    while(j<=len)
    {
        if(address[j] == '.')
        {
            de[i] = '[';
            de[i+1] = '.';
            de[i+2] = ']';
			i=i+3;
			j++;
        }
        else
        {
            de[i] = address[j];
			i++;
			j++;
        }
		
    }
    return de;
}
int main()
{
	char s[] = {"250.100.500.100"};
	printf("%s",defangIPaddr(s));
	return 0;
}
