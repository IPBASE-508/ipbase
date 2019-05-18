package com.ipbase.DataBack.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tianyi
 * @date 2019-05-11 12:57
 */
@Component
public class PathConfig {

    @Value("${path.picture}")
    private String pictrueDir;

    public String getPictrueDir() {
        return pictrueDir;
    }

    public void setPictrueDir(String pictrueDir) {
        this.pictrueDir = pictrueDir;
    }
}
