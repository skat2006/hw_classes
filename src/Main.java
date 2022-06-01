public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Артем", "Каменистый");
        Author author2 = new Author("Серж", "Винтеркей");

        Book book1 = new Book(author1, "Альфа-ноль", 2020);
        Book book2 = new Book(author2, "Эгида", 2022);

        book1.setYear(2019);
        System.out.println("Автор книги " + book2.getBookName() + " - " + book2.getAuthor().getAuthorFirstName() + " " + book2.getAuthor().getAuthorLastName());
    }
}