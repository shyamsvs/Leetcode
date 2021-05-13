
bool isHappy(int n)
{

    int nextval = 0;
    int sq;
    while(1)
    {
        sq = n%10;
        nextval = nextval + (sq * sq);
        n=n/10;
        if(n<=0)
        {
            if(nextval == 1)return 1;
            else if(nextval == 2 || nextval == 3 || nextval == 4 || nextval == 5 || nextval == 6){
                return 0;
            }
            else
            {
                n = nextval;
                nextval = 0;
            }
        }
    }
}
