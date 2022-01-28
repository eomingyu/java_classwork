package sort;

import java.util.Arrays;

public class SwapTest {

	public static void main(String[] args) {

		int[] datas = {45,34,78,65,99,14};
		
		System.out.println(Arrays.toString(datas));
		for(int i=0;i<datas.length;i++) {
			for(int k=i+1;k<datas.length;k++) {
				if(datas[i]>datas[k]) {
					int temp =datas[k];
					datas[k]=datas[i];
					datas[i]=temp;
				}
			}
			System.out.println("i="+i+", 중간결과: "+Arrays.toString(datas));
		}
		
		
		
	}

}
