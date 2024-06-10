package intstack;

class FixedStack implements intStack {
    private int[] stack;
    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;

    }

    public void push(int item) {
        if (tos == stack.length - 1)
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stack[tos--];
    }
}
