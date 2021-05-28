package com.zlx.demo.service;

import com.zlx.demo.dao.UserDao;
import com.zlx.demo.entity.User;

public class UserService {

    UserDao userDao=new UserDao() {
        @Override
        public int insertUser(User User) {
            return 0;
        }

        @Override
        public int selectUser(int id, String url, float tme) {
            return 0;
        }

        @Override
        public int selectByUserId(int id) {
            return 0;
        }

        @Override
        public int selectByUserUrl(String url) {
            return 0;
        }

        @Override
        public int selectByUserUrl(int uuid) {
            return 0;
        }
    };

}
