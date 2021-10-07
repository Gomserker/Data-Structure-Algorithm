/*
 *�� ������ ��ġ(top)������ �ڷḦ �߰�, ����, ������ �� ����(�߰� �ڷ� �� ����)
 *LIFO����(Last In First Out)
 *���� �ֱ��� �ڷḦ ã�ƿ��ų� ���ӿ��� �����丮�� �����ϰ� ������ ��밡��(���or�ٵ�) 
 */

package Stack;

import Array.MyArray;

public class MyArrayStack {

    int top; //�迭 �� ���ڸ��� �ε���;
    MyArray arrayStack;
    
    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }
    
    public MyArrayStack(int size) {
        arrayStack = new MyArray(size);
    }
    
    public void push(int data) { //�ڷḦ �ϳ��� �״� �޼ҵ�
        if(isFull()) {
            System.out.println("Stack is already full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }
    
    public int pop() { //�ڷḦ �ϳ��� ���� �޼ҵ� �� ���������� �ϳ��� ������.
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }
        else {
            return arrayStack.removeElement(--top);
        }
    }
    
    public int peek() { //�������� ��ġ�� ������ ����, ������ �������� ����
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return MyArray.ERROR_NUM;
        }
        else {
            return arrayStack.getElement(--top);
        }
    }
    
    public int getSize() {
        return top;
    }
    
    public boolean isFull() {
        if(top == arrayStack.ARRAY_SIZE) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return true;
        } else {
            return false;
        }
    }
    
    public void printAll() {
        arrayStack.printAll();
    }
}
