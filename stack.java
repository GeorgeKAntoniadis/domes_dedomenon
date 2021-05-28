class stack{
    private int maxSize;
    private long[] array;
    private int top;

public stack(int s)
{
    maxSize= s;
    array= new long[maxSize];
    top=-1;
}
public void push(long j)
{
    array[++top]=j;
}
public long pop()
{
    return array[top--];
}
public long peek()
{
    return array[top];
}
public boolean isEmpty(){
    return (top==-1);
}
public boolean isFull()
{
    return (top==maxSize-1);
}
static class stackapp
{
    public static void main(String[] args
    ){
        stack theStack=new stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(80);
        theStack.push(60);
        while( !theStack.isEmpty()){
            long value=theStack.pop();
            System.out.print(value);
            System.out.print("");
        }
        System.out.println("");
    }
}
}