package search;

import java.util.Scanner;


/*
 pl = "�˻� ����"�� �� �� �ε���
 pr = "�˻� ����"�� �� �� �ε���
 pc = "�˻� ����"�� �߾� �ε���
 */
public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        
        do {
            int pc = (pl + pr) / 2; //�߾� ����� �ε���
            if (a[pc] == key)
                return pc; //ã���� ��ȯ
            else if (a[pc] < key)
                pl = pc + 1; //�߰��ε����� ã�� ������ ������ �˻� ������ ���� �������� ������.
            else
                pr = pc - 1; //�߰� �ε����� ã�� ������ ũ�� �˻� ������ ���� �������� ������.
        } while (pl <= pr); //pl�� pr���� �۰ų� ����������
        
        return -1; //ã�� ���� ������(�˻� ����) -1 ��ȯ.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("��ڼ� : ");
        int num = input.nextInt();
        int[] x = new int[num];
        
        System.out.println("������������ �Է��ϼ���.");
        /*
         Q : �� ��������(�Ǵ� ��������)���� ������ ��Ű�°�?
         A : ���� �˻�(binary Search)�� �����Ϸ��� ��ҵ��� �ݵ�� ���ĵǾ� �־���Ѵ�.
         */
        System.out.print("x[0] : ");
        x[0] = input.nextInt();
        
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = input.nextInt();
            } while (x[i] < x[i - 1]); // x[i]�� x[i - 1]���� ������ �ٽ� �Է½�Ų��.
        }
        
        System.out.print("�˻��� �� : ");
        int ky = input.nextInt();
        
        int idx = binSearch(x, num, ky);
        
        if (idx == -1)
            System.out.println("�׷��� ����");
        else
            System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
    }
}
