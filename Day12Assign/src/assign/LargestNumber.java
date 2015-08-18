package assign;

public class LargestNumber {
	
	
	public static int find_large(int arr[]){  

        int lar=arr[0];  

        for(int i=1;i<arr.length;i++){  

            if(lar<arr[i])  

                lar=arr[i];  

        }  

        return lar;  

 } 

	public static void main(String[] args) {
		
		
		
		System.out.println("Hello!!!!!");
		
	}

}
