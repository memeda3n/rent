package cn.watson.rent.dao.mapper;

import cn.watson.rent.dao.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    void insert(User user);

}
