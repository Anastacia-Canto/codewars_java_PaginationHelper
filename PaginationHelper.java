import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<I>{
	
	private List<I> items = new ArrayList<>();
	private int itemsPerPage;

	/**
	* The constructor takes in an array of items and a integer indicating how many
	* items fit within a single page
	*/
	public PaginationHelper(List<I> collection, int itemsPerPage) {
		for (I item : collection) {
			items.add(item);
		}
		this.itemsPerPage = itemsPerPage;
	}
	
	/**
	* returns the number of items within the entire collection
	*/
	public int itemCount() {
		return items.size();
	}
	
	/**
	* returns the number of pages
	*/
	public int pageCount() {
		return items.size() % itemsPerPage == 0 ? items.size() / itemsPerPage : items.size() / itemsPerPage + 1;
	}
	
	/**
	* returns the number of items on the current page. page_index is zero based.
	* this method should return -1 for pageIndex values that are out of range
	*/
	public int pageItemCount(int pageIndex) {
		if (pageIndex < 0 || pageIndex > pageCount() - 1) return -1;
		return pageIndex < pageCount() - 1 ? this.itemsPerPage : items.size() % itemsPerPage;
	}
	
	/**
	* determines what page an item is on. Zero based indexes
	* this method should return -1 for itemIndex values that are out of range
	*/
	public int pageIndex(int itemIndex) {
		if (itemIndex < 0 || itemIndex > itemCount() - 1) return -1;
		return itemIndex / this.itemsPerPage;
	}
}
