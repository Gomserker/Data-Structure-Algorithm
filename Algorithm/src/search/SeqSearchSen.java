package search;

import java.util.Scanner;

/*
 ���ʹ�(sentinel method)
 [���� �˻� ���� ����]
 1. �˻��� ���� �߰����� ���ϰ� ó������ ������ �Ⱦ�����.
 2. ���ϴ� ���� ã������.
 
 ���� �˻��� �ݺ��� ������ 2���� ������ ��� �Ǵ��Ѵ�. �̶� �ʿ��� �ڿ��� ���̴� ����� ���ʹ�(sentinel method)�̴�.
 �迭 a�� a[0]���� a[7]���� �ִٰ� �����Ѵ�.
  0  1  2  3  4  5  6    7
 [6][4][3][2][1][3][8] [����]
 a[0]���� a[6]�� �ʱ⿡ �غ��� ���� �����Ͱ�, �˻��ϰ��� �ϴ� Ű ���� �� �� �ڸ��� a[7]�� ���� �� ���� ����(sentinel)��� �Ѵ�.
 ���� ���, 2�� �˻��ϰ� ������ ���� 2�� ����, 5�� �˻��ϰ� ������ 5�� ���´�. 
 
 1) ���ϴ� ��(2)�� �غ�� ������([0]~[6]) ���̿� ���� ��
  0  1  2  3  4  5  6   7
 [6][4][3][2][1][3][8] [2]
 
 �� 2�� �����Ƿ� �߰��� �����. 
 
 2) ���ϴ� ��(5)�� �غ�� ������ ���̿� ������
  0  1  2  3  4  5  6   7
 [6][4][3][2][1][3][8] [5]
 
 �� 5(���ʰ�)�� �ɸ��Ƿ� �����.
 ���� ���� �˻� ���� ������ 1���� �������� �ʰ� 2���� �����ϰ� �ȴ�.
 
 */
public class SeqSearchSen {
    static int SeqSearchSen(int[] a, int n, int key) {
        int i = 0;
        
        a[n] = key; // ����(sentinel)
        
        while (true) {
            if (a[i] == key) //�˻� ����
                break;
            i++;
        }
        return i == n ? -1 : i; // i==n�̸� -1 return �ƴϸ� i return
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("��ڼ�: "); //�ʱ⿡ �غ��� ��
        int num = input.nextInt();
        int[] x = new int[num + 1]; //�ʱ⿡ �غ��� �� + ���ʰ�
        
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = (int) (Math.random() * 100);
            System.out.println(x[i]);
        }
        
        System.out.print("�˻��� ��: "); //key�� �Է�
        int ky = input.nextInt();
        
        int idx = SeqSearchSen(x, num, ky); //�迭 x���� ���� ky�� ��� �˻�
        
        if (idx == -1)
            System.out.println("�׷��� ����");
        else
            System.out.println(ky+"��(��) x[" + idx + "] �� �ִ�.");
    }
}
