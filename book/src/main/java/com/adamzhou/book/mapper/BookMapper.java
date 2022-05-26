package com.adamzhou.book.mapper;

import com.adamzhou.book.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper extends BaseMapper<Book> {
}
