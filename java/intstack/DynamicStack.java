package intstack;

public class DynamicStack implements IntStack {
    private int[] stack;
    private int tos;

    DynamicStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++)
                temp[i] = stack[i];
            stack = temp;
            stack[++tos] = item;
        } else
            stack[++tos] = item;

    }

}
