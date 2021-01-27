package net.javaci.thymleafExamples._05_selectionInTemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectionController {

	@GetMapping("selection")
	public String renderSelectionPage(Model model) {
		model.addAttribute("basariliMi", Math.random() > 0.5);
		model.addAttribute("cinsiyet", Math.random() > 0.5 ? "K" : "E");
		
		int elemenetSize = (int) (Math.random() * 3);
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < elemenetSize; i++) {
			list.add("element - " + i);
		}
		
		model.addAttribute("elementList", list);
		
		return "selection";
	}
}
