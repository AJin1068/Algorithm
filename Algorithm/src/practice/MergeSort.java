package practice;

public class MergeSort {
	
	static int [] array;
	static int [] temp;

	private void merge(int low, int mid, int high) {
		
		int i = low,//low~mid까지
			j = mid + 1,//뒤쪽 반은 mid+1에서 시작
	        tempposn = low;//임시포인터
	    
	    while(i <= mid && j <= high) {//i와j의 크기 비교
	    	
	    	if(array[i] <= array[j]) {
	    		
	    		temp[tempposn++] = array[i++];
	    	}
	    	else {
	    		temp[tempposn++] = array[j++]; 
	    	}
	    }
	    while(i <= mid) {
	    	
	    	temp[tempposn++] = array[i++];
	    }
	    while(j <= high) {
	    	
	    	temp[tempposn++] = array[j++];
	    }
	    
	    for(tempposn = low; tempposn <= high; tempposn++) {
	    	
	    	array[tempposn] = temp[tempposn];
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
