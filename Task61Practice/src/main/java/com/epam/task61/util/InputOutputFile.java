package com.epam.task61.util;

import com.epam.task61.model.data.DataSource;
import com.epam.task61.model.entity.Book;
import org.apache.log4j.Logger;

import java.io.*;


public class InputOutputFile {
    final static Logger logger =
            org.apache.log4j.Logger.getLogger(InputOutputFile.class);
    private static File file =
            new File(".\\src\\resource\\data.ser");

    public static Book[] load() {
        try (ObjectInput oi = new ObjectInputStream(
                new FileInputStream(file))){
            return (Book[])oi.readObject();
        } catch (FileNotFoundException exp) {
            logger.info("File not found!");
            return DataSource.getBooks();
        } catch (IOException | ClassNotFoundException exp) {
            logger.error("Error i/o");
            return new Book[0];
        }
    }

    public static void save(Book[] books) {
        try (ObjectOutput oo = new ObjectOutputStream(
                new FileOutputStream(file))){
            oo.writeObject(books);
        } catch (FileNotFoundException exp) {
            System.err.println("file not found");
        } catch (IOException exp) {
            System.err.println("Data not save");
        }
    }
}