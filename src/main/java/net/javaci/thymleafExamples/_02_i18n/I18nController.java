package net.javaci.thymleafExamples._02_i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class I18nController {

	@GetMapping("/international")
	public String getInternationalPage(HttpServletRequest request) {
		Locale loc = RequestContextUtils.getLocale(request);
		System.out.println(loc);
		return "international";
	}
}
