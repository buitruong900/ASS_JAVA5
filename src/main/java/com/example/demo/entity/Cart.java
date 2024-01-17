package com.example.demo.entity;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Cart {
    private ArrayList<Item> items;
}
