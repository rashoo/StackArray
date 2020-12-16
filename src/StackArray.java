public class StackArray {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push( new Employee("Jane", "Jones", 134));
        stack.push(new Employee("Raju","Kumar",223));
        stack.push(new Employee("john","doe",22));

        stack.printStack();
        System.out.println("");
        System.out.println(stack.peek());

    }
}
