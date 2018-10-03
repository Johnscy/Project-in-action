package priv.johnscy.SecKill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.johnscy.SecKill.dao.UserDao;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id){
        return userDao.getById(id);
    }
}
