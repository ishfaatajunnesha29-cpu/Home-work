import java.util.Arrays;
class MergeSortFun
{
	public int[] divide(int ar[])
	{
		if(ar.length==1)
		{
			return ar;
		}
		int mid=ar.length/2;
		int left[]=divide(Arrays.copyOfRange(ar,0,mid));
		int right[]=divide(Arrays.copyOfRange(ar,mid,ar.length));
		return conquer(left,right);
	}
	public int[] conquer(int left[],int right[])
	{
		int i=0,j=0,k=0;
		int br[]=new int[left.length+right.length];
		
		while((i<left.length)&&(j<right.length))
		{
		     if(left[i]>right[j])
			 {
				br[k]=right[j]; 
				k++;
				j++;
			 }	
			 else 
			 {
				br[k]=left[i]; 
				k++;
				i++;
			 }
		}
		while(i<left.length)
		{
			br[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			br[k]=right[j];
			j++;
			k++;
		}
		return br;
	}
}