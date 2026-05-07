package inheritance;

public class HierarchialChild2 extends HierarchialParent {
	public void show2()
	{
		System.out.println("This is Child2");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HierarchialChild2 obj=new HierarchialChild2();
	obj.print();
	obj.show2();
		}

	}
