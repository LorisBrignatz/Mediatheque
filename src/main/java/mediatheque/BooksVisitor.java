package mediatheque;

public class BooksVisitor extends CatalogVisitor{
    @Override
    public String visit(CD cd) {
        return "";
    }
}