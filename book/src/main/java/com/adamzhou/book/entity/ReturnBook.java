package com.adamzhou.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnBook {

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
     * 还书时间
     */
    private LocalDateTime returnTime;

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
    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "ReturnBook{" +
                "readerNumber=" + readerNumber +
                ", bookNumber=" + bookNumber +
                ", returnTime=" + returnTime +
                "}";
    }
}
