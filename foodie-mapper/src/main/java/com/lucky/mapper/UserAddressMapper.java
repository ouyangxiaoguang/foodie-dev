/**
 * @filename:UserAddressDao 2019年10月16日
 * @project   
 * Copyright(c) 2020 欧阳小广 Co. Ltd. 
 * All right reserved. 
 */
package com.lucky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.lucky.pojo.UserAddress;

/**   
 * @Description:TODO(用户地址表数据访问层)
 *
 * @version: 
 * @author: 欧阳小广
 * 
 */
@Mapper
public interface UserAddressMapper extends BaseMapper<UserAddress> {
	
}
