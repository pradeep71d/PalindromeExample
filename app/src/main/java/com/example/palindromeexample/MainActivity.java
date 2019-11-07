package com.example.palindromeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1 = "mam";
        char[] ch = s1.toCharArray();
        char[] reverse=new char[s1.length()];
        int j = ch.length;
        for (int i = 0; i<ch.length; i++) {
            reverse[i]=ch[j-1];
            j--;
        }
        String s3= new String(reverse);
        System.out.println(s3);
        if(s1.equals(s3))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is Not Palindrome");
        }
    }
}


