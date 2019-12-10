int myAtoi(char * str)
{
    int len = strlen(str);
	//printf("%d\n",len);
    int mull=1;
    int ans[100];
    int ctr=0;
	long long reval = 0;
	long long int pow=1;
    for(int i=0;i<len;i++)
    {
        if(str[i] == ' ')
            continue;
        else if(str[i] == '-')
            mull = -1;
        else if(i==0 || str[i-1]=='\0' || str[i-1] == '+' || str[i-1] == '-' || str[i-1] == ' ' || (str[i] >='1' && str[i] <= '9'))
        {
            if(str[i] >= '1' && str[i] <='9')
			{
				ans[ctr] = str[i];
				ctr++;
			}
			else 
			{
				return 0;
			}    
            if(str[i+1] == ' ')
                break;
        }
        else
        {
            return 0;
        }
    }
	for(int i=0;i<ctr;i++)
	{
		ans[i] = ans[i] - 48;
	}
    for(int i=0;i<ctr;i++)
    {
		int mul = (ctr - i) - 1;
		while(mul)
		{
			pow = pow * 10;
			mul--;
		}
        reval = reval + (ans[i] * pow);
		pow = 1;
	}
	long long toreturnans;
	toreturnans = reval * mull;
	//printf("%ld\n",toreturnans);
	if(toreturnans < INT_MIN)return INT_MIN;
	if(toreturnans > INT_MAX)return INT_MAX-1;
	return (int)toreturnans;
}
