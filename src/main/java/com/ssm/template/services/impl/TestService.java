package com.ssm.template.services.impl;

import com.ssm.template.dao.TestDAO;
import com.ssm.template.pojos.User;
import com.ssm.template.services.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    @Autowired
    private TestDAO testDAO;

    public User getUser(String id) {
        return testDAO.getUser(id);
    }
}
