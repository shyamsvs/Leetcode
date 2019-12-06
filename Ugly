#include<stdio.h>
#include<limits.h>
#define SIZE 5
long long min(long long two, long long three, long long five)
{
    if(two <= three && two <= five) return two;
     if(three <= two && three <= five) return three;
     return five;
}
int main()
{
long long int uglyNumbers[SIZE],twoVal, threeVal, fiveVal , minVal;
int twoCtr, threeCtr,fiveCtr, uglyCtr;
uglyNumbers[0] = 1;
twoCtr  = threeCtr = fiveCtr = 0;
twoVal = 2 * uglyNumbers[twoCtr];
threeVal = 3 * uglyNumbers[threeCtr];
fiveVal = 5  * uglyNumbers[fiveCtr];



for(uglyCtr = 1; uglyCtr < SIZE; uglyCtr++ )
{

    minVal = min(twoVal, threeVal, fiveVal);
    uglyNumbers[uglyCtr]  = minVal;
    if(minVal == twoVal) {
            twoCtr++;
            twoVal = 2 * uglyNumbers[twoCtr];
    }

    if(minVal == threeVal)  {
            threeCtr++;
            threeVal = 3 * uglyNumbers[threeCtr];
    }


    if(minVal == fiveVal) {
            fiveCtr++;
            fiveVal = 5  * uglyNumbers[fiveCtr];
    }


}
printf("%lld", uglyNumbers[SIZE-1]);
return 0;
}
