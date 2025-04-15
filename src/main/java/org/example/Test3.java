package org.example;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        List<List<Book>> books = List.of(
                List.of(new Book("Преступление и наказание", "Достоевский", 1000),
                        new Book("Идиот", "Достоевский", 500),
                        new Book("Bойна и мир", "Лермонтов", 700),
                        new Book("Kапитанская дочка", "Пушкин", 600)),
                List.of(new Book("Harry Potter p1", "Joanne Rowling", 1000),
                        new Book("A Song of Ice and Fire p1", "George Raymond Richard Martin", 700))
        );

        /*
    1. Сгруппировать книги по автору
    (Map<String, List<Book>> map)
     */

        /*
    2. Сгруппировать книги по автору, а внутри группы отсортировать по количеству страниц (по возрастанию)
    (Map<String, List<Book>> map)
     */

        /*
    3. Сгруппировать книги авторам, затем внутри группы оставить только название книг (без имени автора, количества страниц)
    (Map<String, List<String>> map)
     */

    }

    private static class Book{
        private String name;
        private String author;
        private int pageSize;

        public Book(String name, String author, int pageSize) {
            this.name = name;
            this.author = author;
            this.pageSize = pageSize;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }

}