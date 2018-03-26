/*						Guriqbal Singh
						Program #7
						April 20, 2017
			This program will implement the merge-sort algorithm  
*/		
	public class Merge {
     
    private int[] array;
    private int[] tempMergArr;										//temp
    private int length;
 
    public static void main(String a[])
    
    {
         
        int[] Arr = {22,23,24,6,7,13,55,14,65,70};
        Merge m = new Merge();
        m.sort(Arr);
        
        for(int i:Arr) 
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int Arr[]) 
    {
        this.array = Arr;
        this.length = Arr.length;
        this.tempMergArr = new int[length];
        MergeSort(0, length - 1);			//assigns lowest val and highest val
    }
 
 /////////////////////////////////////////////////////////////////////////////////////////
 
    public void MergeSort(int low, int high) 
    {						//locates mid point 
         
        if (low < high)
           
            {
            int middle = low + (high - low) / 2;
            
            MergeSort(low, middle);
            
            MergeSort(middle + 1, high);
           
            merge(low, middle, high);
        }
    }
 
 /////////////////////////////////////////////////////////////////////////////////////////
 
    public void merge(int low, int middle, int high) 	//merge 
    {
 
        for (int i = low; i <= high; i++) 
        {
            tempMergArr[i] = array[i];
        }
        
        int i = low;
        int j = middle + 1;
        int l = low;
        
        while (i <= middle && j <= high) 
        {
            if (tempMergArr[i] <= tempMergArr[j]) 
            {
                array[l] = tempMergArr[i];
                i++;
            } else {
                array[l] = tempMergArr[j];
                j++;
            }
            l++;
        }
        while (i <= middle) {
            array[l] = tempMergArr[i];
            l++;
            i++;
        }
 
    }
}




