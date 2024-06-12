package com.mflyyou.json;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BookDomain1 {
    private Long id;
    private String name;

    private List<JsonDetail> dataJson;

    @Data
    public static class JsonDetail implements Serializable {
        private String url;
        private String fileName;
    }
}
