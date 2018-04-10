//Having the same method name with different parameters


package TestNGproject.TestNGproject;
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading obj = new methodoverloading();
		obj.sum();
		obj.sum(1);
	}
		public void sum() {
			System.out.println("no Parameters");
			
			}
		
		public void sum(int i) {
		
			System.out.println(i);
		}
	}

