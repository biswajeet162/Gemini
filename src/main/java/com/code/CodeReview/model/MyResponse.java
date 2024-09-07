package com.code.CodeReview.model;

import java.util.ArrayList;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MyResponse{
    public ArrayList<Candidate> candidates;
}