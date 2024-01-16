package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/admin/common")
@Api(tags="common")
@Slf4j
public class CommonController {

                                 //用来处理从前端传来的文件数据
    @PostMapping("/upload")
    @ApiOperation("uoload files")
    public Result<String> upload(MultipartFile file){
        log.info("uploaded file: {}",file);
        return null;
    }
}
