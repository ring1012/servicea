package servicea.server.controller;

import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

/**
 * @author tanghuan93@foxmail.com
 * @date 2019/10/16
 */
@RestController
public class AController {

    @Resource
    private HttpServletRequest request;

    @PostMapping("/info")
    public JSONObject askb(@RequestBody JSONObject json) {
        Enumeration<String> headerEnum = request.getHeaderNames();
        while (headerEnum.hasMoreElements()) {
            String headerName = headerEnum.nextElement();
            System.out.println(headerName + ":" + request.getHeader(headerName));
        }
        return json;
    }

}
