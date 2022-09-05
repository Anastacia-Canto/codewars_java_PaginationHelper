import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'), 4);
		
		System.out.println("amount of data: " + helper.itemCount());
		System.out.println("amount of pages: " + helper.pageCount());
		System.out.println("amount on page [-1]: " + helper.pageItemCount(-1));
		System.out.println("amount on page [0]: " + helper.pageItemCount(0));
		System.out.println("amount on page [1]: " + helper.pageItemCount(1));
		System.out.println("amount on page [2]: " + helper.pageItemCount(2));
		System.out.println("amount on page [3]: " + helper.pageItemCount(3));
		System.out.println("----------------------------------------------------------");
		System.out.println("page of item [3]: " + helper.pageIndex(3));
		System.out.println("page of item [6]: " + helper.pageIndex(6));
		System.out.println("page of item [9]: " + helper.pageIndex(9));
		System.out.println("page of item [10]: " + helper.pageIndex(10));
	}

}
