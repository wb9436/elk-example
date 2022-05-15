package com.ivan.elk.util;

import lombok.Data;

/**
 * 返回对象
 *
 * @author WuBing
 * @date 2022-05-15 12:08
 */
@Data
public class Result {
    private int code;
    private String message;
    private Object data;

    private Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Result success() {
        return new Result(200, "成功");
    }

    public static Result error() {
        return new Result(201, "失败");
    }

    public Result data(Object data) {
        this.data = data;
        return this;
    }

}
