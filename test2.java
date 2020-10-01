public class test2{
	public static void main(String []args)
	{
		queue obj=new queue(4);
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		System.out.println(obj.isEmpty());
		System.out.println(obj.len());
		System.out.println(obj.first());
		System.out.println(obj.dequeue());
		System.out.println(obj.len());


	}
}