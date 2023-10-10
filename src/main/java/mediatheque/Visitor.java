package mediatheque;

public interface Visitor {
    String visit(CD cd);
    String visit(Book book);
}

