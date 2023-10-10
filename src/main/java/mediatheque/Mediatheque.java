package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	private final CatalogVisitor catalogVisitor = new CatalogVisitor();
	private final BooksVisitor booksVisitor = new BooksVisitor();
	private final CDVisitor cdVisitor = new CDVisitor();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.accept(catalogVisitor);
	}
	
	public void printOnlyBooks() {
		for (Item i : items)
			i.accept(booksVisitor);
	}

	public void printOnlyCDs() {
		for (Item i : items)
			i.accept(cdVisitor);
	}

}
