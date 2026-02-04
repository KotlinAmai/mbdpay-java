package com.github.kotlinamai.mbdpay.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Result {

    /**
     * error
     */
    private String error;

    public boolean isSuccess(){
        return this.error == null || "".equals(error);
    }

}
