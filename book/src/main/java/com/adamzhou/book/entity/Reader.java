package com.adamzhou.book.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reader {

    private static final long serialVersionUID = 1L;

    /**
     * 读者编号
     */
    @TableId
    private String readerNumber;

    /**
     * 姓名
     */
    private String name;

    /**
     * 单位
     */
    private String department;

    /**
     * 性别
     */
    private String gender;

    /**
     * 手机号
     */
    private String telephone;

    public String getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(String readerNumber) {
        this.readerNumber = readerNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerNumber=" + readerNumber +
                ", name=" + name +
                ", department=" + department +
                ", gender=" + gender +
                ", telephone=" + telephone +
                "}";
    }
}
