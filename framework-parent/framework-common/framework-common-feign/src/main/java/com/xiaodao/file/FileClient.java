package com.xiaodao.file;

import com.xiaodao.core.vo.RespVO;
import com.xiaodao.core.vo.RespVOBuilder;
import com.xiaodao.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "file-service", path = "/file", fallbackFactory = FileClientFallback.class, configuration = MultipartSupportConfig.class)
public interface FileClient {

    /**
     * 单个文件上传
     *
     * @param file
     * @return
     */
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    RespVO upload(@RequestPart(value = "file", required = true) MultipartFile file);

    /**
     * 多个文件上传
     *
     * @param files
     * @return
     */
    @PostMapping(value = "/uploads", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    RespVO uploads(@RequestPart(value = "files", required = true) MultipartFile[] files);
}

class FileClientFallback implements FileClient {


    @Override
    public RespVO upload(MultipartFile file) {
        return RespVOBuilder.failure("file-service服务不可用");
    }

    @Override
    public RespVO uploads(MultipartFile[] files) {
        return RespVOBuilder.failure("file-service服务不可用");
    }
}