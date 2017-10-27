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
		System.out.print("���ڸ� �Է��ϼ��� : ");
		try {
			k = Integer.parseInt(in.readLine()); // ���� k�� int�� �ƴ� ���
		} catch(Exception e) {
			System.out.print("�Է¿���");
		}
		
		// BinarySearch Algorithm
		
		while(true) {
			if(low>high) { // ��ü �˻��� �������� ���� �ݺ����� ������
				System.out.println("�˻� �����Ͱ� �����ϴ�");
				break;
			}
			
			mid = (low + high) / 2; // ����� ����
			cnt ++; // �˻�Ƚ���� ����
			System.out.println("�񱳰� : " + data[mid]);
			
			if(data[mid] == k) {
				System.out.println((mid+1)+"��° ��ġ, �˻�Ƚ�� :" + cnt + "  ");
				break;
			}
			if( k>data[mid]) { // ���ؼ� mid ������
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
	}

}
