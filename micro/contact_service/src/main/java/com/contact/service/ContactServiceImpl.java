package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

     //fake list of contacts
    List<Contact>list=List.of(
             new Contact(1L,"arjunpal1104@gmail.com","amit",1344L),
             new Contact(2L,"anitpal1104@gmail.com","anit",1344L),
             new Contact(3L,"amarpal1104@gmail.com","amar",1346L)
     );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
