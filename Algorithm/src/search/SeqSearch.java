package search;

import java.util.Scanner;

public class SeqSearch {
/*
 Linear Search(���� �˻�) aka. sequential search(���� �˻�)
 */
    static int seqSearch(int[] a, int n, int key) {
//  ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻�
        int i = 0;
        
        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }
//    for������ ����� �������⵵�� ���� �� ���� �� �ִ�.
class SeqSearchFor {
    int seqSearchFor(int[] a, int n, int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
    }
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("��ڼ�: ");
        int num = input.nextInt();
        int[] x = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = (int) (Math.random() * 100);
            System.out.println(x[i]);
        }
        
        
        System.out.print("�˻��� ��: ");
        int ky = input.nextInt();
        int idx = seqSearch(x, num, ky);
        
        if (idx == -1)
            System.out.println("�׷��� �����ϴ�.");
        else
            System.out.println(ky + "��(��) x[" + idx + "] �� �ֽ��ϴ�.");
    }

}
