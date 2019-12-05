int distanceBetweenBusStops(int* distance, int distanceSize, int start, int destination)
{
    int distance1=0;
	int distance2=0;
	if(start > destination)
	{
		int j = start;
		while(1)
		{
			distance1 = distance1 + distance[j];
			j++;
			if(j==distanceSize)
			{
				j=0;
			}
			if(j==destination)
			break;
		}
	}
	else
	{
		for(int i=start;i<destination;i++)
    	{
       		distance1 = distance1 + distance[i];
    	}
	}
	int i = start;
    while(1)
	{		
		if(i == 0)
		{
			
			i = distanceSize;
		}
		else
		{
			distance2 = distance2 + distance[i-1];
			i--;
		}
		if(i==destination)
		break;
	}
    if(distance1<distance2)
	return distance1;
	return distance2;
}
