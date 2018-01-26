import java.util.Scanner;
public class L5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int[n];
		int i=0,j=0,temp=1;
		for(i=0;i<=n-1;i++){
		  arr[i]=s.nextInt();
		}
		for(i=0;i<=n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<=n-1;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
