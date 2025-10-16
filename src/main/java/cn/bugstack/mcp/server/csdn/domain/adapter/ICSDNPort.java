package cn.bugstack.mcp.server.csdn.domain.adapter;

import cn.bugstack.mcp.server.csdn.domain.model.ArticleFunctionRequest;
import cn.bugstack.mcp.server.csdn.domain.model.ArticleFunctionResponse;

import java.io.IOException;

/**
 * @Auther: yangjian
 * @Date: 2025-10-16 - 10 - 16 - 21:27
 * @Description: cn.bugstack.mcp.server.csdn.domain.adapter
 * @version: 1.0
 */
public interface ICSDNPort {
    ArticleFunctionResponse writeArticle(ArticleFunctionRequest request) throws IOException;
}
