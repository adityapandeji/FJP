public class ExceptionHandling {
	public static void main(String[] args) {
		int[] arr = {5, 3, 42, 1};
		try{
//			int res = arr[0] / 0;
//			System.out.println(arr[4]);
//			String s = null;
//			System.out.println(s.charAt(0));
//			int res = Integer.parseInt("Varad");
//			String s = "Varad";
//			System.out.println(s.charAt(5));
//			Object a[] = new Integer[4];
//			a[0] = 4.0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception" + e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Out of Bounds Exception" + e);
		}
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception" + e);
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception" + e);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bounds Exception" + e);
		}
		catch(ArrayStoreException e) {
			System.out.println("Array Store Exception" + e);
		}
		finally{
			System.out.println("All Exceptions are handled");
		}
	}
}