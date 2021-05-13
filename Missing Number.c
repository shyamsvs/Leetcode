
int missingNumber(int* nums, int numsSize)
{
    int tot = (numsSize * (numsSize + 1))/2;
    int sum = 0;
    for(int i=0;i<numsSize;i++)
        sum = sum + nums[i];
    return tot - sum;
}
