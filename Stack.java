package cn.list;
import java.util.Arrays;
/**
 * @ClassName Stack
 * @Description TODO
 * @Auther danni
 * @Date 2019/7/29 11:34]
 * @Version 1.0
 **/

public class Stack {
    static final int SIZE=2;
    private int[]  array=new int[SIZE];
    private int top=0;
     private int[] isCapacity(int[] temp){//可直接使用Arrays.copyOf(array,array.length*2);
         int[] newarray=new int[SIZE*2+1];
         for (int i = 0; i <SIZE ; i++) {
             newarray[i]=temp[i];
         }
         temp=newarray;
         return temp;
     }
     public void push(int data){
         if(top==SIZE){
             array=this.isCapacity(this.array);
         }
         this.array[top++]=data;
     }
     public void pop(){
         if(this.isEmpty()){
             System.err.println("栈为空，删除失败");
             return;
         }
         top--;
     }
     public int top(){
         if(this.isEmpty()){
             System.err.println("栈为空");
             return -1;
         }
         return this.array[top-1];
     }
     public boolean isEmpty(){
         return top==0? true:false;
     }
     public int size(){
         return top;
     }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        System.out.println("当前栈容量："+s.array.length+"  "+s.top());
        s.push(3);
        s.push(4);
        System.out.println("当前栈容量："+s.array.length+"  "+s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println(s.size());

    }
}
