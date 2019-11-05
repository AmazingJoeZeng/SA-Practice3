package com.example.demo;

public class mail {

    private final String address;
    private final String content;

    public mail(String address, String content){
        this.address=address;
        this.content=content;
    }

    public String getAddress(){
        return address;
    }

    public String getContent() {
        return content;
    }

}
