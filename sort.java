package arrays;

public class sort {
	public static void main(String args[]) {
		
		int a[]= {1,0,2,1,2,1,0,2,0};
		int i;
		System.out.println("Assending order : ");

		for (i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		System.out.println("Desending order : ");
		
		for (i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}
