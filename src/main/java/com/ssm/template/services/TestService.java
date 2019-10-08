package com.ssm.template.services;

import com.ssm.template.dao.TestDAO;
import com.ssm.template.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDAO testDAO;

    public User getUser(String id){
        return testDAO.getUser(id);
    }
}
