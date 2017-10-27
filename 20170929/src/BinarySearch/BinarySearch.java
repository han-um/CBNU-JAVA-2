package BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {

	public static void main(String[] args) {
		int data[] = {11,16,21,26,35,39,47};
		int k = 0, cnt = 0;
		int low = 0;
		int high = data.length-1;
		int mid;
		
		// input
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하세요 : ");
		try {
			k = Integer.parseInt(in.readLine()); // 만약 k가 int가 아닐 경우
		} catch(Exception e) {
			System.out.print("입력오류");
		}
		
		// BinarySearch Algorithm
		
		while(true) {
			if(low>high) { // 전체 검색을 끝냈으나 아직 반복문에 있을때
				System.out.println("검색 데이터가 없습니다");
				break;
			}
			
			mid = (low + high) / 2; // 가운데값 지정
			cnt ++; // 검색횟수를 누적
			System.out.println("비교값 : " + data[mid]);
			
			if(data[mid] == k) {
				System.out.println((mid+1)+"번째 위치, 검색횟수 :" + cnt + "  ");
				break;
			}
			if( k>data[mid]) { // 비교해서 mid 재지정
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
	}

}
