package org.example.hw32;

import org.example.hw32.model.Library;

import java.util.ArrayList;
import java.util.List;


/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и
 * количества страниц. Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Library library1 = new Library("Название1", "Некрасов", 3.0, 1840, 139);
        Library library2 = new Library("Название2", "Книгописец", 3.0, 2016, 199);
        Library library3 = new Library("Название3", "Автор3", 3.0, 2022, 241);
        Library library4 = new Library("Название4", "Автор4", 3.0, 1901, 322);
        Library library5 = new Library("Название5", "Автор5", 3.0, 2011, 322);
        Library library6 = new Library("Название6", "Автор6", 3.0, 1867, 322);

        List<Library> libraryList = new ArrayList<>();
        libraryList.add(library1);
        libraryList.add(library2);
        libraryList.add(library3);
        libraryList.add(library4);
        libraryList.add(library5);
        libraryList.add(library6);

        for (int i = 0; i < libraryList.size(); i++) {
            if (libraryList.get(i).getAuthor().contains("а") | libraryList.get(i).getAuthor().contains("А")) {
                if (libraryList.get(i).getYearPublishing() >= 2010 & checkNumberPages(libraryList.get(i).getNumberPages()) == true){
                    System.out.println(libraryList.get(i).getName());
                }
            }

        }

    }

    private static boolean checkNumberPages(Integer n) {
        int k = 0;
        for (int i = 1; i <n; i++) {
            if (n%i ==0){
                k++;
            }
            if (k>1){
                return false;
            }
        }
        return true;
    }
}
