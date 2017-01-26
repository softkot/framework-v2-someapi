package org.somecompany.api;


import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.ApiClass;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiReference;
import com.google.api.server.spi.response.UnauthorizedException;

import java.util.HashMap;

@ApiReference(BaseEndpoint.class)
@ApiClass(resource = "method")
public class DemoEndpoint extends BaseEndpoint {

    @ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, path = "method/getHash")
    public HashMap<String, String> getHash(User user) throws UnauthorizedException {
        HashMap<String, String> res = new HashMap<>();
        res.put("key1", "value1");
        res.put("key2", "value2");
        res.put("key3", "value3");
        if (user != null) {
            res.put("user", user.getEmail());
        }
        return res;
    }
}


