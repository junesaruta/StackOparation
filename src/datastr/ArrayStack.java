package datastr;

import java.util.NoSuchElementException;
public class ArrayStack implements Stack {
    private Object[] elementData;
    private int size;
    public ArrayStack(int cap) {
        elementData = new Object[cap];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void push(Object e) {
        if (size == elementData.length) {
            Object[] a = new Object[2 * size];
            for (int i = 0; i < size; i++)
                a[i] = elementData[i];
            elementData = a;
        }
        elementData[size++] = e;
    }
    public Object peek() {
        if (isEmpty())
            throw new NoSuchElementException();
        return elementData[size-1];
    }
    public Object pop() {
        Object e = peek();
        elementData[--size] = null;
        return e;
    }
    public String toString() {
        String s = "=== BOTTOM OF STACK ===\n";
        for (int i = 0; i < size; i++)
            s += elementData[i]+"------------------------\n";
        return s;
    }
    public void sortmaxmin(){
        Object[] a=new Object[elementData.length];
        for(int i=0;i< elementData.length;i++){
            Integer num= (Integer) elementData[0];
        }
    }
}
