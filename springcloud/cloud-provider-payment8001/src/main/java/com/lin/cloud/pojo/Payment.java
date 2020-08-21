package com.lin.cloud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @Author ccgg
 * @Date 2020/8/21 11:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "payment")
public class Payment implements Serializable {

    @TableId(value = "id" ,type = IdType.INPUT)
    private Long id;
    private String serial;
}
