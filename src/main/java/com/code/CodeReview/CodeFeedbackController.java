package com.code.CodeReview;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.code.CodeReview.model.Content;
import com.code.CodeReview.model.MyRequest;
import com.code.CodeReview.model.Part;
import com.code.CodeReview.model.question.FinalResponse;
import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
public class CodeFeedbackController {

    // @Autowired
    // private SeleniumService seleniumService;

    @Autowired
    private ApiService apiService;

    @GetMapping("/path")
    public FinalResponse getMethodName(@RequestBody String requestdata) throws JsonProcessingException {

      ArrayList<Part> parts = new ArrayList<>();
      Part part1 = new Part();
      part1.text = requestdata;
      parts.add(part1);

      Part part2 = new Part();
      part2.text ="write feedback" ;
      parts.add(part2);

      Part part3 = new Part();
      part3.text ="write error free and improved code again" ;
      parts.add(part3);

      Part part4 = new Part();
      part4.text ="STRICTLY write the response in this format  1st line #FEEDBACK and then write after 5 line #NEWCODE" ;
      parts.add(part4);



      // Create content
      ArrayList<Content> contentList = new ArrayList<>();
      Content content1 = new Content();
      content1.parts = parts;
      contentList.add(content1);

      // Create root object
      MyRequest root = new MyRequest();
      root.contents = contentList;


       String data[] = apiService.generateContent(root).getBody().getCandidates().get(0).getContent().getParts().get(0).getText().split("#NEWCODE");
       

       FinalResponse finalResponse =new FinalResponse();
       finalResponse.setFeedback(data[0]);
       finalResponse.setCode(data[1]);



      return finalResponse;
    }
  
}
