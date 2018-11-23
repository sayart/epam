package com.epam.task61.controller;

import com.epam.task61.service.ServiceBooks;
import com.epam.task61.util.InputUtility;
import com.epam.task61.view.BookView;

public class Controller {
    private ServiceBooks serviceBooks = new ServiceBooks();
    private BookView view = new BookView();

    public void run() {
        while (true) {
            view.printMessage(BookView.MAIN_MENU);
            int number = InputUtility.inputInt(view);
            ItemMenu command = defineMenuItem(number);
            switch (command) {
                case SHOW_BOOKS:
                    view.printMessage(BookView.ALL_BOOKS);
                    view.printMessage(serviceBooks.showAllBooks());
                    break;
                case FIND_AUTHOR:
                    view.printMessage(serviceBooks.searchBooksByAuthor(InputUtility.inputString(view)));
                    break;
                case FIND_PUBLISH:
                    view.printMessage(serviceBooks.searchBooksByPublisher(InputUtility.inputString(view)));
                    break;
                case FIND_YEAR:
                    view.printMessage(serviceBooks.searchBooksAfterYear(InputUtility.inputInt(view)));
                    break;
                case SORT_PUBLISH:
                    view.printMessage(view.SORRTED_BOOKS);
                    view.printMessage(serviceBooks.sortByPublisher());
                    break;
                case EXIT:
                    serviceBooks.saveBooks();
                    System.exit(0);
                    break;
                default:
                    view.printMessage(BookView.WRONG_INPUT_DATA);
            }
        }
    }

    private ItemMenu defineMenuItem(int number) {
        ItemMenu[] itemMenus = ItemMenu.values();
        if (number < 0 || number >= itemMenus.length) {
            return ItemMenu.DEFAULT;
        }
        return itemMenus[number];
    }
}
