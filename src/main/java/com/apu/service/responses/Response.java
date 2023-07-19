package com.apu.service.responses;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Response {

    private String message;
    private int code;

}
