package practice;

public class MergeSort {
	
	static int [] array;
	static int [] temp;

	private void merge(int low, int mid, int high) {
		
		int i = low,//low~mid����
			j = mid + 1,//���� ���� mid+1���� ����
	        tempposn = low;//�ӽ�������
	    
	    while(i <= mid && j <= high) {//i��j�� ũ�� ��
	    	
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
