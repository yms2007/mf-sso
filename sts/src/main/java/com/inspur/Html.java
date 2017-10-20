package com.inspur;

/**
 * Created by yangmingsheng on 2017/10/20.
 */

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 模板测试.
 *
 * @author Administrator
 */

@Controller


public class Html {
    /**
     * 返回html模板.
     */


    @RequestMapping("/helloHtml")
    public String

    helloHtml(Map<String, Object> map) {

        map.put("hello", "from TemplateController.helloHtml");
        return "/helloHtml";
    }
}  

