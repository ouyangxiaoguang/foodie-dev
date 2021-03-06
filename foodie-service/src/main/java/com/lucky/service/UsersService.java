/**
 * @filename:UsersService 2019年10月16日
 * @project   
 * Copyright(c) 2020 欧阳小广 Co. Ltd. 
 * All right reserved. 
 */
package com.lucky.service;

import com.lucky.bo.UserBO;
import com.lucky.pojo.Users;
import com.baomidou.mybatisplus.extension.service.IService;
/**   
 * @Description:TODO(用户表服务层)
 * @version: 
 * @author: 欧阳小广
 * 
 */
public interface UsersService extends IService<Users> {

    boolean queryUsernameIsExist(String username);

    Users register(UserBO userBO);

    Users login(String username, String md5Str);
}