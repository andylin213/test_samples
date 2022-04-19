package sca_test;

import org.dom4j.DocumentHelper;
import javax.servlet.http.HttpServletRequest;

public class test {
    @PostMapping("/DocumentHelper/vuln")
    public String DocumentHelper1(HttpServletRequest req) {
        try {
            String body = req.getParameter("xml");
            DocumentHelper.parseText(body); // parse xml
        } catch (Exception e) {
            return "error";
        }
        return "DocumentHelper xxe vuln code";
    }
}
