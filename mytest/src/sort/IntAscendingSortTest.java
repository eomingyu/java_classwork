package sort;

import java.util.Arrays;

public class IntAscendingSortTest {

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
/*
i          k          k        k            k	
i=0  , datas[0] > datas[1] , datas[2],datas[3],...,datas[5]  값의비교와 교환
i=1  , datas[1] > datas[2],  datas[3],...,datas[5]   값의비교와 교환
i=2  , datas[2] > datas[3],.  ..,datas[5]   값의비교와 교환

i=4  , datas[4] > datas[5]
i=5  , k변수 반복 실행 안합니다. 
*/ 