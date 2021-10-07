package StackWithInterface;

public class ArrayStackWithInterface implements StackWithInterface{

    private int top;
    private int stackSize;
    private char[] stackArr;
    
  //stack�� �����ϴ� ������
    public ArrayStackWithInterface() {
        top = -1; //���� ������ �ʱ�ȭ
        stackArr = new char[this.stackSize];
    }
    
    public ArrayStackWithInterface(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];
    }
    
    @Override
    public boolean isEmpty() {
        //stack �����Ͱ� -1�̸� �����Ͱ� ����. ���� false ���
        return (top == -1);
    }
    @Override
    public boolean isFull() {
        //stack �����Ͱ� stack�� ������ �ε����� �����ϸ� false �ƴϸ� false
        return (top == this.stackSize-1);
    }
    @Override
    public void push(char item) {
        if(isFull()) {
            System.out.println("stack is full");
        } else {
            //���� ���� �����Ͱ� ����Ű�� �ε����� ������(item) �߰�
            stackArr[++top] = item;
            System.out.println("Inserted Item: " + item);
        }
    }
    @Override
    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return 0;
        } else {
            System.out.println("Deleted Item: " + stackArr[top]);
            return stackArr[top--];
        }
        
    }
    @Override
    public char peek() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
            return 0;
        } else {
            System.out.println("Peeked Item: " + stackArr[top]);
            return stackArr[top];
        }
        
    }
    @Override
    public void clear() {
        if(isEmpty()) {
            System.out.println("Stack is already empty");
        } else {
            top = -1; //stack ������ �ʱ�ȭ
            stackArr = new char[this.stackSize]; //���ο� stack array ����
            System.out.println("Stack is Cleared");
        }
    }
    
    public void printStack() {
        if(isEmpty()) {
            System.out.println("���� �� ������ ����");
        } else {
            System.out.print("Stacked Elements: ");
//            for(char c:stackArr) {
//                System.out.print(c + " ");
//            }
                
                for(int i=0; i<=top; i++) {
                    System.out.print(stackArr[i] + " ");
//                    if(stackArr[top] == 0) {
//                        if(top == -1) {
//                            System.out.print(" ");
//                        }
//                    }
                }
            System.out.println();
        }
    }
}
