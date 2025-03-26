package com.digital.common.app.controller;

import com.digital.common.api.response.BaseResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


    @GetMapping(path = "/base", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BaseResponse> getBaseDetails() {
        return ResponseEntity.ok(BaseResponse.builder().code(0).message("Success").build());
    }
}
