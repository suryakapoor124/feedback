package controller;

import model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import repository.FeedbackRespository;

@Controller
public class FeedbackController {
    @Autowired
    FeedbackRespository repo; //created a obj of feedback repo


    @GetMapping("/")
    public String home(){ return "home";}

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("feedback", new Feedback());
        return "feedback-form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Feedback feedback){
        repo.save(feedback);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("feedbacks", repo.findAll());
        return "feedback-list";

    }


}
