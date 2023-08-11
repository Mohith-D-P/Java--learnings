package sorting;

public class SelectionSort {

	void sort(int a[])
	{
		int min;
		int pos;
		int help;

		for (int i = 0; i <=a.length-2; i++) {
			min=a[i];
			pos=i;
			for (int j = i+1; j <=a.length-1; j++) {
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			help=a[i];
			a[i]=a[pos];
			a[pos]=help;
		}

	}
}
