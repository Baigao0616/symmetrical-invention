package com.adamzhou.book.service.impl;

import com.adamzhou.book.entity.Manager;
import com.adamzhou.book.mapper.ManagerMapper;
import com.adamzhou.book.service.ManagerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author AdamZhou
 * @since 2022-05-22
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerMapper, Manager> implements ManagerService {

}
