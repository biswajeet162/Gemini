package com.code.CodeReview.model;

import java.util.ArrayList;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class MyRequest{
    public ArrayList<Content> contents;
}
