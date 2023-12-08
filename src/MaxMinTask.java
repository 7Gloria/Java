import java.util.List;

public class MaxMin {
public static void main(String[] args) {
	int[] array = new int[] {20,11,13,14,2,30,46,25,99};
	int min=20;
	int max=0;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]>max)
		{
			max=array[i];
		}
		if(array[i]<min)
		{
			min=array[i];
		}
		
	}
	
	System.out.println("Max Value : "+ max);
	System.out.println("Min Value :" +min);
	
}
}
