package com.xiaodao.datasource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author gaolei
 * @Date 2019/12/16 15:23
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageDomain<T> {
    private T t;
    private int pageIndex;
    private int pageSize;

}
