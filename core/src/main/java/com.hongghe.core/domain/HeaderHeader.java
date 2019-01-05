package com.hongghe.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-05 11:41
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class HeaderHeader {
    public String name;
    public Integer age;
}
