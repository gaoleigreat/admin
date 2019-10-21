package com.xiaodao.feign.file;

import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.feign.config.MultipartSupportConfig1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "file-service", path = "/file", fallbackFactory = FileClientFallback.class,configuration = MultipartSupportConfig1.class)
public interface FileClient {
    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    RespVO upload(@RequestPart(value = "file", required = true) MultipartFile file);
}

class FileClientFallback implements FileClient {


    @Override
    public RespVO upload(MultipartFile file) {
        {
            return RespVOBuilder.failure("file-service服务不可用");
        }
    }
}