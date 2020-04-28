/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.util.List;

/**
 *
 * @author ticho
 */
public class UserImpl implements IUser {

    private dao.UserDaoImpl userDao;

    @Override
    public User findById(int id) {
        //User epistrefei
        if (id <= 0) {
            return null;

        } else {
            //DAO = DATA ACCESS OBJECT
            userDao = new dao.UserDaoImpl();
            return userDao.findById(id);

        }

    }

    @Override
    public List<User> findAll() {

        return userDao.findAll();

    }

    @Override
    public boolean deleteById(int id) {
        if (id <= 0) {
            return false;

        } else {
            //DAO = DATA ACCESS OBJECT

            return userDao.deleteById(id);

        }
    }

    @Override
    public boolean updateById(int id, User user) {
        if (id <= 0) {
            return false;

        } else {
            //DAO = DATA ACCESS OBJECT
            
            return userDao.updateById(id,user);

        }

    

    }

    @Override
    public boolean save(User user) {
     return userDao.save(user);
    }

}
