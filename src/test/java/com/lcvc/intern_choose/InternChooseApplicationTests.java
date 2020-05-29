package com.lcvc.intern_choose;

import com.lcvc.intern_choose.dao.AdminDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class InternChooseApplicationTests {
        @Resource
        private AdminDao adminDao;
    @Test
    void contextLoads() {
        System.out.println(adminDao.get(1));
    }

}
