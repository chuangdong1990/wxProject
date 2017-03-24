package com.lyy.dao;

import com.lyy.entity.SysUser;

public interface SysUserMapper {
    
    SysUser selectByUsername(String username);

}