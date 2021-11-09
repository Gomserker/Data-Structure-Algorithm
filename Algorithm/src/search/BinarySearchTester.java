package search;

import java.util.Arrays;
import java.util.Scanner;

/*
 Java�� �迭���� BinarySearch�� ǥ�� ���̺귯�� �޼ҵ�� �����Ѵ�.
 java.util.Arrays Ŭ������ binarySearch �޼ҵ�.
 
 Arrays Ŭ������ binarySearch �޼ҵ��� ����
 1. ���� �˻� �޼ҵ带 ���� �� �ʿ䰡 ����.
 2. ��� �ڷ����� �迭���� ����� �� �ִ�.
 
 static int binarySearch(Object[] a, Object key)
 ������������ ���ĵ� �迭 a�� �����ϰ�, Ű ���� key�� ��Ҹ� ���� �˻��Ѵ�.
 
 �˻��� �����ϸ� �ش� ����� �ε����� ��ȯ,
 �˻��� �����ϸ� �Է��� ���� x��� �����Ҷ�, -x-1 ���� ��ȯ�Ѵ�.
 */
public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.print("��ڼ�: ");
        int num = input.nextInt();
        int[] x = new int[num];
        
        System.out.println("������������ �Է��Ͻÿ�");
        
        System.out.print("x[0] : ");
        x[0] = input.nextInt();
        
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = input.nextInt();
            } while (x[i] < x[i - 1]);
        }
        
        System.out.print("�˻��� ��");
        int key = input.nextInt();
        
        int idx = Arrays.binarySearch(x, key);
        
        if (idx < 0)
            System.out.println("�׷��� ����.");
        else
            System.out.println(key + "��(��) x[" + idx + "]�� �ִ�.");
    }
}
