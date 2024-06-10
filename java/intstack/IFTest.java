public class IFTest {
    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack(5);
        FixedStack myStack2 = new FixedStack(8);
        for (int i = 0; i < 10; i++)
            dynamicStack.push(i);
        for (int i = 0; i < 8; i++)
            myStack2.push(i);
        System.out.println("stack in mystack1:");
        for (int i = 0; i < 15; i++)
            System.out.println(dynamicStack.pop());
        System.out.println("stack in mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }

}