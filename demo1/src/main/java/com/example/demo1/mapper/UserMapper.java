package com.example.demo1.mapper;

import com.example.demo1.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 功能描述：人员信息
 * @date 2019/7/12 9:57
 * @author JH014294_BLY
 */

@Repository
public interface UserMapper {

    User Sel(String username);

}
