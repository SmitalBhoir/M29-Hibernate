package org.tnsif.client;

public class Client {

	public static <BookService> void main(String[] args) {
		BookService service=new BookServiceImpl();
	}

}
