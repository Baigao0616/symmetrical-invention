package com.adamzhou.book.service.impl;

import com.adamzhou.book.entity.Book;
import com.adamzhou.book.mapper.BookMapper;
import com.adamzhou.book.service.BookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
