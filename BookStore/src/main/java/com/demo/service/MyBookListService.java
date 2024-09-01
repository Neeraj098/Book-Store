package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.demo.entity.MyBookList;
import com.demo.repository.MyBookListRepository;

@Service
public class MyBookListService 
{
    @Autowired
    private MyBookListRepository mybook;

    public void saveMyBooks(MyBookList book)
    {
        mybook.save(book);
    }

    public List<MyBookList> getAllMyBooks()
    {
        return mybook.findAll();
    }

    public void deleteById(int id)
    {
        mybook.deleteById(id);
    }


}
