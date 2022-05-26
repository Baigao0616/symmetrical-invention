package com.adamzhou.book.service.impl;

import com.adamzhou.book.entity.BorrowBook;
import com.adamzhou.book.mapper.BorrowBookMapper;
import com.adamzhou.book.service.BorrowBookService;
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
public class BorrowBookServiceImpl extends ServiceImpl<BorrowBookMapper, BorrowBook> implements BorrowBookService {

}
