package com.adamzhou.book.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowBook {
    private static final long serialVersionUID = 1L;

    /**
     * 读者编号
     */
    private String readerNumber;

    /**
     * 书号
     */
    private String bookNumber;

    /**
     * 借书时间
     */
    private LocalDateTime borrowTime;

    public String getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(String readerNumber) {
        this.readerNumber = readerNumber;
    }
    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }
    public LocalDateTime getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(LocalDateTime borrowTime) {
        this.borrowTime = borrowTime;
    }

    @Override
    public String toString() {
        return "BorrowBook{" +
                "readerNumber=" + readerNumber +
                ", bookNumber=" + bookNumber +
                ", borrowTime=" + borrowTime +
                "}";
    }
}
