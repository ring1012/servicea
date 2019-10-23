package servicea.server.controller;

import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import servicea.server.configuration.PropertiesBean;

/**
 * @author tanghuan93@foxmail.com
 * @date 2019/10/16
 */
@RestController
@EnableConfigurationProperties(PropertiesBean.class)
public class AController {

    @Resource
    private HttpServletRequest request;

    @Autowired
    private PropertiesBean propertiesBean;

    @PostMapping("/info")
    public JSONObject askb(@RequestBody JSONObject json) {
        Enumeration<String> headerEnum = request.getHeaderNames();
        while (headerEnum.hasMoreElements()) {
            String headerName = headerEnum.nextElement();
            System.out.println(headerName + ":" + request.getHeader(headerName));
        }
        json.put("k8sMsg", propertiesBean.getMessage());
        return json;
    }

    @GetMapping("/health")
    public String health() {
        return "success";
    }

}
