package net.javaci.thymleafExamples._03_scope;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScopeController {
	
	@GetMapping("/scope")
	public String renderScopePage(Model model, HttpServletRequest request) {
		
		System.out.println(request.getAttribute("requestValue"));
		
		model.addAttribute("controllerValue", "bu deger controllerdan geliyor");
		
		return "scope";
	}

}
