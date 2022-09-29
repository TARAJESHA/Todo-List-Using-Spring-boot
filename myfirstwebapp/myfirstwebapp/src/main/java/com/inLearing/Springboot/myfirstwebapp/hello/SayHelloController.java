package com.inLearing.Springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class SayHelloController {
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String hrml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<title>");
		sb.append("hi my title");
		sb.append("</title>");
		sb.append("<body>");
		 sb.append("chdcbhdsbcjhs");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
