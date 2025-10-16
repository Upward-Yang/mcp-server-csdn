package cn.bugstack.mcp.server.csdn.infrastructure.gateway.dto;

import lombok.Data;

/**
 * @Auther: yangjian
 * @Date: 2025-10-16 - 10 - 16 - 21:23
 * @Description: cn.bugstack.mcp.server.csdn.infrastructure.gateway.dto
 * @version: 1.0
 */
@Data
public class ArticleResponseDTO {
    private Integer code;
    private String traceId;
    private ArticleData data;
    private String msg;

    @Data
    public static class ArticleData {
        private String url;
        private Long id;
        private String qrcode;
        private String title;
        private String description;
    }
}
