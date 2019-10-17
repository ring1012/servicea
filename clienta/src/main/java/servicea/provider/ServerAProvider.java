package servicea.provider;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.alibaba.fastjson.JSONObject;

import istio.fake.annotation.FakeClient;


/**
 * @author tanghuan93@foxmail.com
 * @date 2019/10/16
 */
@FakeClient(name="servera")
public interface ServerAProvider {

    @PostMapping(value = "/servera/info")
    JSONObject info(@RequestHeader(HttpHeaders.AUTHORIZATION) String authentication, @RequestBody JSONObject json);


}
