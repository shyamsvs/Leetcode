double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size)
{
        int tot = nums1Size + nums2Size;
        int ctr=0;
        int *arr = (int *)malloc(tot * sizeof(int));
        for(int i=0;i<nums1Size;i++)
        {
            arr[ctr] = nums1[i];
			
			ctr++;
        }
        for(int i=0;i<nums2Size;i++)
        {
            arr[ctr] = nums2[i];
		
			ctr++;
        }
		int temp;
		for(int i=0;i<tot-1;i++)
		{
			for(int j=i+1;j<tot;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<tot;i++)
			printf("%d\n",arr[i]);
        if(tot%2!=0)
        {
			int re = tot/2;
            return arr[re];
        }
        else
        {
            int mid = tot/2;
            return ((arr[mid-1] + arr[mid])/2.0);
        }
    
    return 0;

}
