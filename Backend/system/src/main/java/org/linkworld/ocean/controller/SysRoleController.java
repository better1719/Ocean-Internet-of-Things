package org.linkworld.ocean.controller;


import org.linkworld.ocean.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author LiuXiangCheng
 * @since 2021-11-05
 */
@RestController
@RequestMapping("/sys-role")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;
}

