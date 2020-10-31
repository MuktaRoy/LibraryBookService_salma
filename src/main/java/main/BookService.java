package main;

import model.LibraryBook;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    public static List<LibraryBook> libraryBookList = new ArrayList<LibraryBook>(Arrays.asList(
            new LibraryBook("101", "Introduction to Computer","Software","Amit Garg",
                    "Reader's Zone","955","2011",
                    "Theoretical foundations of computer systems"),

            new LibraryBook("102", " Client Server Computing","Client Server Architectural aspects","Lalit Kumar",
                    " Sun India Publications, New Delhi","1020","2012",
                    "Technologies used to develop client server systems"),

            new LibraryBook("103", "Mobile Computing","Networking","Vinay Kumar Singhal",
                    "K Nath & Sons, Meerut","750","2011",
                    "Wireless technologies and computer communications"),

            new LibraryBook("104", " Data Structure Using C","Software","Sharad Kumar Verma",
                    " Thakur Publications Lucknow","955","2015",
                    "Computer's basic data structure usic C"),

            new LibraryBook("105", "Computer Networks","Networking","Saurabh Singhal",
                    "Thakur Publications ","1500","2015-2016",
                    "Introduction to computer networking system")


    ));


    public  List<LibraryBook> getAllLibraryBooks(){
        return libraryBookList;
    }

    public LibraryBook getLibraryBook(String id){
        return libraryBookList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addLibraryBook(LibraryBook libraryBook) {
        libraryBookList.add(libraryBook);
    }

    public void updateLibraryBook(LibraryBook lib, String id) {

        for(int i=0; i<libraryBookList.size(); i++){
            LibraryBook libraryBook= libraryBookList.get(i);

            if(libraryBook.getId().equals(id)){
                libraryBookList.set(i, lib);
            }
        }
    }


    public void deleteLibraryBook(String id) {
        libraryBookList.removeIf(t->t.getId().equals(id));
    }
}
