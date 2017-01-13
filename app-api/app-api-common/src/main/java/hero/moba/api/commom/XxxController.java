package hero.moba.api.commom;

import com.alibaba.fastjson.JSON;
import hero.moba.utils.ajax.AjaxResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Frank on 2017/1/13.
 */
@Controller
@RequestMapping("xxx")
public class XxxController {

    @RequestMapping(value="x", method = RequestMethod.GET)
    @ResponseBody
    public String xxx(HttpServletRequest request){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(-1);
        ajaxResponse.setMessage("error message.");

        return JSON.toJSONString(ajaxResponse);
    }
}
